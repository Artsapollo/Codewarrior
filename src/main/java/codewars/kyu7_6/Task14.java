package codewars.kyu7_6;

/*
Input
The input consists of a single non-empty string, consisting only of uppercase English letters,
the string's length doesn't exceed 200 characters

Output
Return the words of the initial song that Polycarpus used to make a dubsteb remix. Separate the words with a space.

Examples
songDecoder("WUBWEWUBAREWUBWUBTHEWUBCHAMPIONSWUBMYWUBFRIENDWUB")
  // =>  WE ARE THE CHAMPIONS MY FRIEND
 */
public class Task14 {
    public static String SongDecoder(String song) {
//My solution
        String[] erase = song.split("WUB");

        StringBuilder db = new StringBuilder();

        for (int i = 0; i < erase.length; i++) {
            if (!erase[i].isEmpty() && db.length() == 0) {
                db.append(erase[i]);
            } else if (!erase[i].isEmpty() && db.length() != 0) {
                db.append(" " + erase[i]);
            }
        }

        return db.toString();
//Shorter solution
//return song.replaceAll("(WUB)+", " ").trim();

    }

    public static void main(String[] args) {
        System.out.println(SongDecoder("WUBWEWUBAREWUBWUBTHEWUBCHAMPIONSWUBMYWUBFRIENDWUB"));
    }
}
