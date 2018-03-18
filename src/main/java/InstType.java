public enum InstType {
        Piano("Piano", "Keyboard"),
        Guitar("Guitar", "Strings");

        private String name;
        private String type;


    InstType(String name, String type){

            this.name = name;
            this.type = type;
        }

        public String getName() { return name;}

        public String getType() { return type;}
    }


