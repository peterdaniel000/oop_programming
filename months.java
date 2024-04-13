// months enumeration
enum month {
    January,
    February,
    March,
    April,
    May,
    June,
    July,
    August,
    September,
    October,
    November,
    December
}

class months {
    public static void main(String[] args) {
        month newVar = month.May;
       // System.out.println(newVar);
       switch (newVar) {
        case January :
        System.out.println("This is january");
        break;
        case February :
        System.out.println("This is february");
        break;
        case March :
        System.out.println("This is march");
        break;
        case April :
        System.out.println("This is april");
        break;
        case May :
        System.out.println("This is may");
        break;
        case June :
        System.out.println("This is june");
        break;
        case July :
        System.out.println("This is july");
        break;
        case August :
        System.out.println("This is august");
        break;
        case September :
        System.out.println("This is september");
        break;
        case October :
        System.out.println("This is october");
        break;
        case November :
        System.out.println("This is november");
        break;
        case December : 
        System.out.println("This is december");
        break;
       }
    }
}