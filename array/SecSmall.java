class SecSmall {
    public static void main(String[] args) {
        int temp;
        int a[] = { 10, 60, 30, 20, 40 };
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

        }
        System.out.println("Second Largest is:" + a[2] + " , " + "Third Largest is:" + a[3]);
    }
}