public class urlcheck {
    public static void main(String[] args){
        String url = "https://example.com";
        if((url.startsWith ("http:") || url.startsWith("https:")) && url.endsWith(".com")){
            System.out.println("Valid URL");
        }else{
            System.out.println("Invalid URL");
        }
    }
    
}
