public class TagMaker {
    private String name;
    private String organization;

    // constructor
    public TagMaker() {
        clearTag();
    }

    // method to set the name
    public void setName(String name) {
        this.name = name;
    }

    // method to set the organization
    public void setOrganization(String organization) {
        this.organization = organization;
    }

    // method to print the tag with the name and organization
    public void printTag() {
        System.out.println("############################################################################");
        System.out.println("### ANNUAL CONFERENCE ###");
        System.out.println("############################################################################");
        System.out.println("### NAME: " + name);
        System.out.println("###");
        System.out.println("############################################################################");
        System.out.println("### ORGANIZATION: " + organization);
        System.out.println("###");
        System.out.println("############################################################################");
    }

    // method to clear the name and organization
    public void clearTag() {
        name = "";
        organization = "";
    }

    // method to print a blank tag
    public void printBlankTag() {
        System.out.println("############################################################################");
        System.out.println("### ANNUAL CONFERENCE ###");
        System.out.println("############################################################################");
        System.out.println("### NAME: ");
        System.out.println("###");
        System.out.println("############################################################################");
        System.out.println("### ORGANIZATION: ");
        System.out.println("###");
        System.out.println("############################################################################");
    }

    public static void main(String[] args) {
        // example usage
        TagMaker tagMaker = new TagMaker();

        // set name and organization
        tagMaker.setName("Christina M.");
        tagMaker.setOrganization("Game Development Club");

        // print the tag
        tagMaker.printTag();

        // clear name and organization
        tagMaker.clearTag();

        // print a blank tag
        tagMaker.printBlankTag();
    }
}

//Output
//############################################################################
//### ANNUAL CONFERENCE ###
//############################################################################
//### NAME: Christina M.
//###
//############################################################################
//### ORGANIZATION: Game Development Club
//###
//############################################################################
//############################################################################
//### ANNUAL CONFERENCE ###
//############################################################################
//### NAME:
//###
//############################################################################
//### ORGANIZATION:
//###
//############################################################################