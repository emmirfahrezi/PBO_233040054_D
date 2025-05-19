package pertemuan9.tugas4;

public class makanan extends produk {
        protected String level;

        public makanan (String nama, double harga, String level) {
            super(nama, harga);
            this.level = level;
        }

        public String getLevel() {
            return level;
        }

        public void setLevel(String level) {
            this.level = level;
        }

}
