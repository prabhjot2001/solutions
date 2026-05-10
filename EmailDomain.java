public class EmailDomain {
    public static String getDomainName(String email){
        return email.substring(email.indexOf("@")+1, email.lastIndexOf("."));
    }
    public static void main(String[] args) {
        String email1 = "random.something@gmail.com";
        String email2 = "gem@gov.in";
        System.out.println(getDomainName(email1));
        System.out.println(getDomainName(email2));
    }
}
