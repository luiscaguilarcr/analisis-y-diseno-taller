package tutorial;

public class Utility {

    public static int random(){
        return 1+(int) Math.floor(Math.random()*99);
    }

    public static int random(int bound){
        //return 1+random.nextInt(bound);
        return 1+(int) Math.floor(Math.random()*bound);
    }

    public static String instanceOf(Object a, Object b){
        if(a instanceof Integer&&b instanceof Integer) return "integer";
        if(a instanceof String&&b instanceof String) return "string";
        if(a instanceof Character&&b instanceof Character) return "character";
        if(a instanceof LinkedList &&b instanceof LinkedList) return "singlyLinkedList";
        //if(a instanceof Student&&b instanceof Student) return "student";
        return "unknown"; //desconocido
    }

    public static String instanceOf(Object a){
        if(a instanceof Integer) return "integer";
        if(a instanceof String) return "string";
        return "unknown"; //desconocido
    }

    public static boolean equals(Object a, Object b){
        switch(instanceOf(a, b)){
            case "integer":
                Integer x=(Integer) a; Integer y=(Integer) b;
                return x==y;
            case "string":
                String v=(String) a; String w=(String) b;
                return v.compareToIgnoreCase(w)==0;
            case "character":
                Character c=(Character) a; Character d=(Character) b;
                return c.compareTo(d)==0;
            case "singlyLinkedList":
                LinkedList s=(LinkedList)a;
                LinkedList t=(LinkedList)b;
                return s.equals(t);
        }
        return false; //en cualquier otro caso
    }


}
