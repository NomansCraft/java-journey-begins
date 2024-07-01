package noman.love.java.chapter3.examples;

public class ASCIITable {

    public static void main(String[] args) {

        String bioData = """
                                    BIO-DATA
                +--------------------+--------------------------+
                |Full name           |Md. Ohiduzzaman (Noman)   |
                |Father's name       |Md. Shahazahan Mollah     |
                |Mother's name       |Mrs. Sufia Begum          |
                |Date of Birth       |25/07/1986                |
                |Nationality         |Bangladeshi               |
                |Permanent Address   |Village- Baiga, Post Offic|
                |                    |e- Salinaboxa, Police Stat|
                |                    |ion: Kashiani, District- G|
                |                    |opalgonj                  |
                |Education           |Bachelor of Commerce (BBA)|
                +--------------------+--------------------------+
                """;

        System.out.println(bioData);
    }
}
