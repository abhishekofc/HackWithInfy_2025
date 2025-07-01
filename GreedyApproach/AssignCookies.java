import java.util.*;

class AssignCookies {
    public int findMaximumCookieStudents(int[] Student, int[] Cookie) {
        int n = Student.length;
        int m = Cookie.length;
        // Pointers
        int l = 0, r = 0;
        Arrays.sort(Student);
        Arrays.sort(Cookie);

        while (l < n && r < m) {
            /*If the current cookie can satisfy the current student, move to the next student*/
            if (Cookie[r] >= Student[l]) {
                l++;
            }
            r++;
        }
        return l; 
    }

    public static void main(String[] args) {
        int[] Student = {1, 2};
        int[] Cookie = {1, 2, 3};
        AssignCookies solution = new AssignCookies();
        int result = solution.findMaximumCookieStudents(Student, Cookie);
        System.out.println("Number of students satisfied: " + result);
    }
}
