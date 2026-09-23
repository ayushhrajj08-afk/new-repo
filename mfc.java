class Solution {
    void whileLoop(int d) {
        int sum = 0;
        int i = 1;

        while (i <= 50) {
            sum += (i - 1) * 10 + d;
            i++;
        }
        System.out.println(sum);
    }
    void main(){
        whileLoop(5);
    }
}