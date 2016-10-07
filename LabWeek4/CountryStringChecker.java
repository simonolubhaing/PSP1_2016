public class CountryStringChecker
{
        public static void main(String[] args)
        {
                String[] countryNames = {"Afghanistan","Albania","Algeria","Andorra","Angola","Antigua and Barbuda","Argentina","Armenia","Aruba","Australia","Austria","Azerbaijan", "The Bahamas","Bahrain","Bangladesh","Barbados","Belarus","Belgium","Belize","Benin","Bhutan","Bolivia","Bosnia and Herzegovina","Botswana","Brazil", "Brunei", "Bulgaria", "Burkina Faso", "Burma", "Burundi", "Cambodia","Cameroon","Canada", "Cabo Verde","Central African Republic","Chad","Chile","China","Colombia","Comoros","Democratic Republic of the Congo ", "Republic of the Congo","Costa Rica","Cote d'Ivoire","Croatia","Cuba","Curacao","Cyprus","Czech Republic", "Denmark","Djibouti","Dominica", "Dominican Republic", "East Timor","Ecuador","Egypt","El Salvador","Equatorial Guinea","Eritrea","Estonia","Ethiopia", "Fiji", "Finland", "France", "Gabon","Gambia, The","Georgia","Germany","Ghana","Greece","Grenada","Guatemala","Guinea","Guinea-Bissau","Guyana", "Haiti","Holy See","Honduras","Hong Kong","Hungary", "Iceland","India","Indonesia","Iran","Iraq","Ireland","Israel","Italy", "Jamaica","Japan","Jordan", "Kazakhstan","Kenya","Kiribati","North Korea","South Korea","Kosovo","Kuwait","Kyrgyzstan", "Laos","Latvia","Lebanon","Lesotho","Liberia","Libya","Liechtenstein","Lithuania","Luxembourg", "Macau","Macedonia","Madagascar","Malawi","Malaysia","Maldives","Mali","Malta","Marshall Islands","Mauritania","Mauritius","Mexico","Micronesia", "Moldova","Monaco","Mongolia","Montenegro","Morocco","Mozambique", "Namibia","Nauru","Nepal","Netherlands","New Zealand","Nicaragua","Niger","Nigeria","Norway", "Oman", "Pakistan","Palau","Palestinian Territories","Panama","Papua New Guinea","Paraguay","Peru","Philippines","Poland", "Portugal", "Qatar", "Romania","Russia", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia","Saint Vincent and the Grenadines","Samoa","San Marino","Sao Tome and Principe","Saudi Arabia", "Senegal","Serbia","Seychelles","Sierra Leone","Singapore","Sint Maarten","Slovakia","Slovenia","Solomon Islands","Somalia","South Africa", "South Korea","South Sudan","Spain","Sri Lanka","Sudan","Suriname","Swaziland", "Sweden","Switzerland","Syria", "Taiwan","Tajikistan","Tanzania","Thailand","Timor-Leste","Togo","Tonga","Trinidad and Tobago","Tunisia","Turkey","Turkmenistan","Tuvalu", "Uganda","Ukraine","United Arab Emirates","United Kingdom","Uruguay","Uzbekistan", "Vanuatu","Venezuela","Vietnam", "Yemen", "Zambia","Zimbabwe"};
				
				String response = "";
				String containedString = "";
				
				Scanner keyboard = new Scanner(System.in);
				
				System.out.println("Would you like to check how many countries contain a String  ?");
				response = keyboard.next();
				
				while(response.equalsIgnoreCase("y"))
				{
					System.out.println("What String do you want to check ?");
					containedString = keyboard.next();
					
					System.out.println("The following countries contain "+containedString);
					
					//Go through each country name in the countryNames array. At each position you visit check
					//if the String at that location contains the String which the user has asked to check (i.e. containedString)
					for(int i=0; i<countryNames.length; i++)
					{
						if(countryNames[i].contains(containedString))
						{
							System.out.println(countryNames[i]);
						}
					}
					
					System.out.println("Do you want to do another check ?");
					response = keyboard.next();
				}
				System.out.println("Thank you for using this program!");
		}
}