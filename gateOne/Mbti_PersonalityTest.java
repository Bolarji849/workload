import java.util.Scanner;

public class Mbti_PersonalityTest {
    private static Scanner scan = new Scanner(System.in);
    private static String finalResult = "";
    private static int[][] numAOrB = new int[4][2];

    public static void main(String[] args) {


        System.out.println("Enter name: ");
        String name = scan.nextLine();


        String[] response1 = extrovertVsIntrovert();
        String[] response2 = SensingVsIntuitive();
        String[] response3 = thinkingVsFeeling();
        String[] response4 = judgingVsPerceptive();

        System.out.println("Hello " + name);

        printUserResponse(response1, numAOrB[0]);
        printUserResponse(response2, numAOrB[1]);
        printUserResponse(response3, numAOrB[2]);
        printUserResponse(response4, numAOrB[3]);

        System.out.println("Your MBTI Personality Type: " + finalResult);
		 personalityType();


	 }

    public static void printUserResponse(String[] response, int[] array) {
        for (String answer : response) {
            System.out.println(answer);
        }

        System.out.println("Number Of A Chosen: " + array[0]);
        System.out.println("Number Of B Chosen: " + array[1]);
    }

    public static String[] extrovertVsIntrovert() {
        String[] response = new String[5];
        String[][] question = {
            {"A: Expend energy, enjoy groups", "B: Conserve energy, enjoy one-on-one"},
            {"A: More outgoing, think out loud", "B: More reserved, think to yourself"},
            {"A: Seek many tasks, public activities", "B: Seek private, solitary activities"},
            {"A: External, communicate, express yourself", "B: Internal, reticent"},
            {"A: Active, initiative", "B: Reflective, deliberate"}
        };

        int count = 0;
        for (int index = 0; index < 5; index++) {
            System.out.print(question[index][0] + "  ");
            System.out.println(question[index][1]);
            System.out.print("Enter your choice (A or B): ");
            String input = scan.nextLine();
            if (input.equalsIgnoreCase("A") || input.equalsIgnoreCase("B")) {
                if (input.equalsIgnoreCase("A")) {
                    count++;
                    response[index] = question[index][0];
                } else {
                    response[index] = question[index][1];
                }
            }
        }
        if (count > 2) finalResult += "E";
        else finalResult += "I";
        numAOrB[0][0] = count;
        numAOrB[0][1] = 5 - count;
        return response;
    }

    public static String[] SensingVsIntuitive() {
        String[] response = new String[5];
        String[][] question = {
            {"A: Interpret literally", "B: Look for meaning and possibilities"},
            {"A: Practical, realistic", "B: Imaginative, innovative"},
            {"A: Standard, usual", "B: Different, novel"},
            {"A: Focus on here-and-now", "B: Look to the future"},
            {"A: Facts, things", "B: Ideas, dreams"}
        };

        int count = 0;
        for (int index = 0; index < 5; index++) {
            System.out.print(question[index][0] + "  ");
            System.out.println(question[index][1]);
            System.out.print("Enter your choice (A or B): ");
            String input = scan.nextLine();
            if (input.equalsIgnoreCase("A") || input.equalsIgnoreCase("B")) {
                if (input.equalsIgnoreCase("A")) {
                    count++;
                    response[index] = question[index][0];
                } else {
                    response[index] = question[index][1];
                }
            }
        }
        if (count > 2) finalResult += "S";
        else finalResult += "N";
        numAOrB[1][0] = count;
        numAOrB[1][1] = 5 - count;
        return response;
    }

    public static String[] thinkingVsFeeling() {
        String[] response = new String[5];
        String[][] question = {
            {"A: Logical, thinking", "B: Empathetic, feeling"},
            {"A: Candid, straight-forward", "B: Tactful, kind"},
            {"A: Firm, tend to criticize", "B: Gentle, appreciate"},
            {"A: Tough-minded", "B: Tender-hearted"},
            {"A: Matter of facts", "B: Sensitive, people-oriented"}
        };

        int count = 0;
        for (int index = 0; index < 5; index++) {
            System.out.print(question[index][0] + "  ");
            System.out.println(question[index][1]);
            System.out.print("Enter your choice (A or B): ");
            String input = scan.nextLine();
            if (input.equalsIgnoreCase("A") || input.equalsIgnoreCase("B")) {
                if (input.equalsIgnoreCase("A")) {
                    count++;
                    response[index] = question[index][0];
                } else {
                    response[index] = question[index][1];
                }
            }
        }
        if (count > 2) finalResult += "T";
        else finalResult += "F";
        numAOrB[2][0] = count;
        numAOrB[2][1] = 5 - count;
        return response;
    }

    public static String[] judgingVsPerceptive() {
        String[] response = new String[5];
        String[][] question = {
            {"A: Organized, orderly", "B: Flexible, adaptable"},
            {"A: Plan, schedule", "B: Unplanned, spontaneous"},
            {"A: Regulated, structured", "B: Easy-going"},
            {"A: Preparation, plan ahead", "B: Go with the flow"},
            {"A: Control, govern", "B:  latitude, freedom"}
        };

        int count = 0;
        for (int index = 0; index < 5; index++) {
            System.out.print(question[index][0] + "  ");
            System.out.println(question[index][1]);
            System.out.print("Enter your choice (A or B): ");
            String input = scan.nextLine();
            if (input.equalsIgnoreCase("A") || input.equalsIgnoreCase("B")) {
                if (input.equalsIgnoreCase("A")) {
                    count++;
                    response[index] = question[index][0];
                } else {
                    response[index] = question[index][1];
                }
            }
        }
        if (count > 2) finalResult += "J";
        else finalResult += "P";
        numAOrB[3][0] = count;
        numAOrB[3][1] = 5 - count;
        return response;
    }




	public static void personalityType(){

	if (finalResult.equals("INTJ")){

		System.out.printf("INTJ (Architect) is a personality type with the Introverted, Intuitive, Thinking, and Judging traits.%n These thoughtful tacticians love perfecting the details of life, applying creativity and rationality to everything they do. %n Their inner world is often a private, complex one.");
		System.out.printf("People with the INTJ personality type (Architects) are intellectually curious individuals with a deep-seated thirst for knowledge. %n INTJs tend to value creative ingenuity, straightforward rationality, and self-improvement. %nThey consistently work toward enhancing intellectual abilities and are often driven by an intense desire to master any and every topic that piques their interest.");

	}

	if (finalResult.equals("INTP")){

		System.out.printf("INTP (Logician) is a personality type with the Introverted, Intuitive, Thinking, and Prospecting traits. %n These flexible thinkers enjoy taking an unconventional approach to many aspects of life. %n They often seek out unlikely paths, mixing willingness to experiment with personal creativity.");
		System.out.printf("People with the INTP personality type (Logicians) pride themselves on their unique perspective and vigorous intellect.%n They can’t help but puzzle over the mysteries of the universe – which may explain why some of the most influential philosophers and scientists of all time have been INTPs.%n People with this personality type tend to prefer solitude, as they can easily become immersed in their thoughts when they are left to their own devices. %n They are also incredibly creative and inventive, and they are not afraid to express their novel ways of thinking or to stand out from the crowd.");
	}



	if (finalResult.equals("ENTJ")){

		System.out.printf("ENTJ (Commander) is a personality type with the Extraverted, Intuitive, Thinking, and Judging traits.%n They are decisive people who love momentum and accomplishment. %n They gather information to construct their creative visions but rarely hesitate for long before acting on them..");

	}

	if (finalResult.equals("ENTP")){

		System.out.printf("ENTP (Debater) is a personality type with the Extraverted, Intuitive, Thinking, and Prospecting traits. They tend to be bold and creative, deconstructing and rebuilding ideas with great mental agility. They pursue their goals vigorously despite any resistance they might encounter.");

	}

	if (finalResult.equals("INFJ")){

		System.out.printf("INFJ (Advocate) is a personality type with the Introverted,%n Intuitive, Feeling, and Judging traits. %n They tend to approach life with deep thoughtfulness and imagination. %n Their inner vision, personal values, and a quiet, principled version of humanism guide them in all things.");

	}

	if (finalResult.equals("INFP")){

		System.out.printf("INFP (Mediator) is a personality type with the Introverted, Intuitive, Feeling, and Prospecting traits. These rare personality types tend to be quiet, open-minded, and imaginative, and they apply a caring and creative approach to everything they do.");

	}

	
	if (finalResult.equals("ENFJ")){

		System.out.printf("ENFJ (Protagonist) is a personality type with the Extraverted, Intuitive,  Feeling, and Judging traits. %n These warm, forthright types love helping others, and they tend to have strong ideas and values. %nThey back their perspective with the creative energy to achieve their goals.");

	}

	if (finalResult.equals("ENFP")){

		System.out.printf("ENFP (Campaigner) is a personality type with the Extraverted, Intuitive, Feeling, and Prospecting traits. %n These people tend to embrace big ideas and actions that reflect their sense of hope and goodwill toward others.%n Their vibrant energy can flow in many directions.");

	}
	
	if (finalResult.equals("ISTJ")){

		System.out.printf("ISTJ (Logistician) is a personality type with the Introverted, Observant, Thinking, and Judging traits. %n These people tend to be reserved yet willful, with a rational outlook on life. %n They compose their actions carefully and carry them out with methodical purpose.");

	}


	if (finalResult.equals("ISFJ")){

		System.out.printf("ISFJ (Defender) is a personality type with the Introverted, Observant, Feeling, and Judging traits. %n These people tend to be warm and unassuming in their own steady way. %n They’re efficient and responsible, giving careful attention to practical details in their daily lives.");

	}

	if (finalResult.equals("ESTJ")){

		System.out.printf("ESTJ (Executive) is a personality type with the Extraverted, Observant, Thinking, and Judging traits. %n They possess great fortitude, emphatically following their own sensible judgment. %n They often serve as a stabilizing force among others, able to offer solid direction amid adversity.");
	
	}

	if (finalResult.equals("ESFJ")){

		System.out.printf("ESFJ (Consul) is a personality type with the Extraverted, Observant, Feeling, and Judging traits. %n They are attentive and people-focused, and they enjoy taking part in their social community. %n Their achievements are guided by decisive values, and they willingly offer guidance to others.");

	}

	if (finalResult.equals("ISTP")){

		System.out.printf("ISTP (Virtuoso) is a personality type with the Introverted, Observant, Thinking, and Prospecting traits. %n They tend to have an individualistic mindset, pursuing goals without needing much external connection. %n They engage in life with inquisitiveness and personal skill, varying their approach as needed.");

	}
	
	if (finalResult.equals("ISFP")){

		System.out.printf("ISFP (Adventurer) is a personality type with the Introverted, Observant, Feeling, and Prospecting traits. %n They tend to have open minds, approaching life, new experiences, and people with grounded warmth. %n Their ability to stay in the moment helps them uncover exciting potentials.");

	}

	if (finalResult.equals("ESTP")){

		System.out.printf("ESTP (Entrepreneur) is a personality type with the Extraverted, Observant, Thinking, and Prospecting traits. %n They tend to be energetic and action-oriented, deftly navigating whatever is in front of them. %n They love uncovering life’s opportunities, whether socializing with others or in more personal pursuits.");

	}
	
	if (finalResult.equals("ESFP")){

		System.out.printf("ESFP (Entertainer) is a personality type with the Extraverted, Observant, Feeling, and Prospecting traits. These people love vibrant experiences, engaging in life eagerly and taking pleasure in discovering the unknown. They can be very social, often encouraging others into shared activities.");

	}

}
}







