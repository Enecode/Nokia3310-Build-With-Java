import java.util.Scanner;

public class Nokia3310 {

        static int menu;
        static int phoneBook;
        static int options;
        static int messages;
        static int set1;
        static int common;
        static int callRegister;
        static int callDuration;
        static int showCallCost;
        static int callCostSettings;
        static int tones;
        static int settings;
        static int phoneSettings;
        static int securitySettings;
        static int callDivert;
        static int clock;


        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.printf("Press 1 to go main menu");

            while (input.hasNext()) {

                int menu = input.nextInt();
                switch (menu) {
                    case 1:
                        System.out.println("Phone Book menu");
                        ++phoneBook;
                        break;
                    case 2:
                        System.out.println("search");
                        ++phoneBook;
                        break;
                    case 3:
                        System.out.println("Add name");
                        ++phoneBook;
                        break;
                    case 4:
                        System.out.println("Erase");
                        ++phoneBook;
                        break;
                    case 5:
                        System.out.println("Edit");
                        ++phoneBook;
                        break;
                    case 6:
                        System.out.println("Assign tone");
                        ++phoneBook;
                        break;
                    case 7:
                        System.out.println("Send b'card");
                        ++phoneBook;
                        break;
                    case 8:
                        System.out.println("options\npress 911 for type of view\n press 912 for memory status");
                        ++phoneBook;
                        break;
                    case 911:
                        System.out.println("Type of view");
                        ++options;
                        break;
                    case 912:
                        System.out.println("Memory Status");
                        ++options;
                        break;
                    case 9:
                        System.out.println("Speed dial");
                        ++phoneBook;
                        break;
                    case 10:
                        System.out.println("Voice tags");
                        ++phoneBook;
                        break;
                }

                switch (menu) {
                    case 11:
                        System.out.println("Messages");
                        ++messages;
                        break;
                    case 12:
                        System.out.println("Write messages");
                        ++messages;
                        break;
                    case 13:
                        System.out.println("Inbox");
                        ++messages;
                        break;
                    case 14:
                        System.out.println("Outbox");
                        ++messages;
                        break;
                    case 15:
                        System.out.println("Picture message");
                        ++messages;
                        break;
                    case 16:
                        System.out.println("Template");
                        ++messages;
                        break;
                    case 17:
                        System.out.println("Smileys");
                        ++messages;
                        break;
                }

                switch (menu){
                    case 18:
                        System.out.println("\npress 81 for message center number\npress 82 for message sent as\n press 83 for message validity");
                        ++set1;
                        break;
                    case 81:
                        System.out.println("Message center number");
                        ++set1;
                        break;
                    case 82:
                        System.out.println("Message sent as");
                        ++set1;
                        break;
                    case 83:
                        System.out.println("Message validity");
                        ++set1;
                        break;
                }

                switch (menu) {
                    case 19:
                        System.out.println("\npress 91 for delivery reports\npress 92 for Reply via same center number\npress 93 for message validity\npress 94 info service\npress 95 for voice mailbox number\npress 96 for Service command editor");
                        ++common;
                        break;
                    case 91:
                        System.out.println("Delivery report");
                        ++common;
                        break;
                    case 92:
                        System.out.println("Reply via same centre");
                        ++common;
                        break;
                    case 93:
                        System.out.println("Character Support");
                        ++common;
                        break;
                    case 94:
                        System.out.println("Info service");
                        ++common;
                        break;
                    case 95:
                        System.out.println("Voice mailbox number");
                        ++messages;
                        break;
                    case 96:
                        System.out.println("Service command editor");
                        ++messages;
                        break;
                }
                switch (menu) {
                    case 20:
                        System.out.println("Chat");
                        ++phoneBook;
                        break;
                }
                switch (menu) {
                    case 21:
                        System.out.println("Call register");
                        ++callRegister;
                        break;
                    case 22:
                        System.out.println("press 41 for missed calls\npress 42 for missed calls\npress 43 for dialled numbers\npress 44 for erase recent calls lists");
                        ++callRegister;
                        break;
                    case 41:
                        System.out.println("Missed calls");
                        ++callRegister;
                        break;
                    case 42:
                        System.out.println("Received calls");
                        ++callRegister;
                        break;
                    case 43:
                        System.out.println("Dialled numbers");
                        ++callRegister;
                        break;
                    case 44:
                        System.out.println("Erase recent call lists");
                        ++callRegister;
                        break;
                }
                switch (menu) {
                    case 23:
                        System.out.println("press 51 for last call duration\npress 52 for all calls' duration\npress 53 for Received calls' duration\npress 54 for dialled calls' duration\npress 55 for clear timers");
                        ++callDuration;
                        break;
                    case 51:
                        System.out.println("Last call duration");
                        ++callDuration;
                        break;
                    case 52:
                        System.out.println("All calls' duration");
                        ++callDuration;
                        break;
                    case 53:
                        System.out.println("Received calls' duration");
                        ++callDuration;
                        break;
                    case 54:
                        System.out.println("Dialled calls' duration");
                        ++callDuration;
                        break;
                    case 55:
                        System.out.println("Clear timers");
                        ++callDuration;
                        break;
                }

                switch (menu) {
                    case 24:
                        System.out.println("press 61 for last call cost\npress 62 for all calls' cost\npress 63 for clear counters");
                        ++showCallCost;
                        break;
                    case 61:
                        System.out.println("Last call cost");
                        ++showCallCost;
                        break;
                    case 62:
                        System.out.println("All calls' cost");
                        ++showCallCost;
                        break;
                    case 63:
                        System.out.println("Clear counters");
                        ++showCallCost;
                        break;
                }
                switch (menu){
                    case 25:
                        System.out.println("press 71 for call cost limit\npress 72 for show costs in");
                        ++callCostSettings;
                        break;
                    case 71:
                        System.out.println("call cost limit");
                        ++callCostSettings;
                        break;
                    case 72:
                        System.out.println("Show costs in");
                        ++callCostSettings;
                        break;
                }
                switch (menu){
                    case 26:
                        System.out.println("Prepaid credit");
                        ++callRegister;
                        break;
                }

                switch (menu) {
                    case 27:
                        System.out.println("press 261 for Ringing tone\npress 262 for Ringing volume\npress 263 for incoming call alert\npress 264 for Composer\npress 265 for message alert tone\npress 266 for Keypad tone\npress 267 for Warning and games tone\npress 268 for Vibrating alert\npress 269 for Screen saver");
                        ++tones;
                        break;
                    case 261:
                        System.out.println("Ringing tones");
                        ++tones;
                        break;
                    case 262:
                        System.out.println("Ringing volume");
                        ++tones;
                        break;
                    case 263:
                        System.out.println("Incoming call alert");
                        ++tones;
                        break;
                    case 264:
                        System.out.println("Composer");
                        ++tones;
                        break;
                    case 265:
                        System.out.println("Message alert tone");
                        ++tones;
                        break;
                    case 256:
                        System.out.println("Keypad tones");
                        ++tones;
                        break;
                    case 267:
                        System.out.println("Warning and game tone");
                        ++tones;
                        break;
                    case 268:
                        System.out.println("vibrate alert");
                        ++tones;
                        break;
                    case 269:
                        System.out.println("Screen saver");
                        ++tones;
                        break;
                }
                switch (menu) {
                    case 28:
                        System.out.println("press 271 for call setting\npress 272 for speed dialing\npress 273 for call waiting options\npress 274 own number sending\npress 275 for phone line in use\npress 276 for automatic answer");
                        ++settings;
                        break;
                    case 271:
                        System.out.println("Automatic redial");
                        ++settings;
                        break;
                    case 272:
                        System.out.println("Speed dialling");
                        ++settings;
                        break;
                    case 273:
                        System.out.println("Call waiting options");
                        ++settings;
                        break;
                    case 274:
                        System.out.println("Own number sending");
                        ++settings;
                        break;
                    case 275:
                        System.out.println("Phone line in use");
                        ++settings;
                        break;
                    case 276:
                        System.out.println("Automatic answer");
                        ++settings;
                        break;
                }
                switch (menu) {
                    case 29:
                        System.out.println("press 281 for language\npress 282 for cell info display\npress 283 for welcome note\npress 284 for network selection\npress 285 for lights\npress 286 for confirm sim service actions");
                        ++phoneSettings;
                        break;
                    case 281:
                        System.out.println("Language");
                        ++phoneSettings;
                        break;
                    case 282:
                        System.out.println("Cell info display");
                        ++phoneSettings;
                        break;
                    case 283:
                        System.out.println("Welcome note");
                        ++phoneSettings;
                        break;
                    case 284:
                        System.out.println("network selection");
                        ++phoneSettings;
                        break;
                    case 285:
                        System.out.println("Lights");
                        ++phoneSettings;
                        break;
                    case 286:
                        System.out.println("Confirm SIM service actions");
                        ++phoneSettings;
                        break;
                }

                switch (menu) {
                    case 30:
                        System.out.println("press 291 for pin code request\npress 292 call barring service\npress 293 for fixed dialing\npress 294 for closed user group\npress 295 for phone security\npress 296 for change access codes");
                        ++securitySettings;
                        break;
                    case 291:
                        System.out.println("PIN code request");
                        ++securitySettings;
                        break;
                    case 292:
                        System.out.println("Call barring service");
                        ++securitySettings;
                        break;
                    case 293:
                        System.out.println("Fixed dialling");
                        ++securitySettings;
                        break;
                    case 294:
                        System.out.println("Closed user group");
                        ++securitySettings;
                        break;
                    case 295:
                        System.out.println("Phone security");
                        ++securitySettings;
                        break;
                    case 296:
                        System.out.println("Change access code");
                        ++securitySettings;
                        break;
                }
                switch (menu){
                    case 31:
                        System.out.println("Restore factory setting");
                        ++settings;
                        break;
                }
                switch (menu) {
                    case 32:
                        System.out.println("Call divert");
                        ++callDivert;
                        break;
                    case 33:
                        System.out.println("Games");
                        ++callDivert;
                        break;
                    case 34:
                        System.out.println("Calculator");
                        ++callDivert;
                        break;
                    case 35:
                        System.out.println("Reminders");
                        ++callDivert;
                        break;
                }
                switch (menu){
                    case 36:
                        System.out.println("press 351 for alarm clock\npress 352 for clock settings\npress 353 for date settings\npress 354 for stopwatch\npress 355 for countdown timer\npress 356 for auto update of date and time");
                        ++clock;
                        break;
                    case 351:
                        System.out.println("Alarm clock");
                        ++clock;
                        break;
                    case 352:
                        System.out.println("Clock settings");
                        ++clock;
                        break;
                    case 353:
                        System.out.println("Date settings");
                        ++clock;
                        break;
                    case 354:
                        System.out.println("Stopwatch");
                        ++clock;
                        break;
                    case 355:
                        System.out.println("Countdown timer");
                        ++clock;
                        break;
                    case 356:
                        System.out.println("Auto update of date and time");
                        ++clock;
                        break;
                }
                switch (menu){
                    case 38:
                        System.out.println("Profiles");
                        ++phoneBook;
                        break;
                    case 39:
                        System.out.println("Sim services");
                        ++phoneBook;
                        break;
                    default:
                        break;
                }
            }
        }
    }

