public class Post {
        private String cadPost;
        private String postRel;

        public Pessoa(String CadPost, String postRel) {
            super();
            this.cadPost = cadPost;
            this.postRel = postRel;
        }
        public String getCadPost() {
            return cadPostadPost;
        }
        public void setCadPost(String cadPost) {
            this.cadPost = cadPost;
        }
        public String getPostRel() {
            return postRel;
        }
        public void setPostRel(String postRel) {
            this.postRel = postRel;
        }

        }

        public String mostraDados() {
            return getCadPost() + "\n" + getPostRel()  "\n""\n\n";
        }

}
