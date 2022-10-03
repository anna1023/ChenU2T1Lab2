public class ChatBotRunner {
    public static void main (String[] args)
    {
ChatBot Erica = new ChatBot("Erica", 12);
Erica.greeting("Anna");
Erica.weather();
double convertFeetToMeters = Erica.convertFeetToMeters(12);
System.out.println("There are "+convertFeetToMeters+" meters in 12 feet.");
Erica.favoriteNumber(12);
int addNumbers = Erica.addNumbers(1,2,3);
Erica.birthday();
String Color = Erica.Color("Teal");
System.out.println(Color);
String goodbye = Erica.goodbye();
System.out.print (goodbye);
    }

}
