void main() {
    List<String> name = List.of("Jamir", "Khamir", "Ahmadinejad", "Trump");
    List<Integer> age = List.of(2, 36, 12, 500);

    for (String a : name){
        System.out.println(a);
        for (int b : age){
            System.out.println(b);
        }
    }
}

