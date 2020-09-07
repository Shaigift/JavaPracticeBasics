package Exercise26;

public class PhraseOMatic {
public static void main (String[] args) {
// make three sets of words to choose from. Add your own!

String[] wordListOne = {"24/7","multiTier","30000 meters","B-to-B","sarcasm","frontend", "web-based","pervasive", "running", "clown","mood", "district"};

String[] wordListTwo = {"empowered", "Green",
"value-added", "beachball", "centric", "distributed",
"clustered", "branded","outside-the-box", "positioned",
"networked", "fox", "leveraged", "nail",
"box", "shared", "cooperative", "accelerated"};

String[] wordListThree = {"lightbulb", "grass", "pantry", "sun", "cabinent",

"strategy", "mindmap", "star", "space", "vision",
"paradigm", "bed"};
// find out how many words are in each list
int oneLength = wordListOne.length;
int twoLength = wordListTwo.length;
int threeLength = wordListThree.length;
// generate three random numbers
int rand1 = (int) (Math.random() * oneLength);
int rand2 = (int) (Math.random() * twoLength);
int rand3 = (int) (Math.random() * threeLength);
// now build a phrase
String phrase = wordListOne[rand1] + " " +
wordListTwo[rand2] + " " + wordListThree[rand3];
// print out the phrase
System.out.println("What we need is a " + phrase);
}
}
