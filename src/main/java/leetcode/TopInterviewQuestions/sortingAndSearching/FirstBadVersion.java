package leetcode.TopInterviewQuestions.sortingAndSearching;

/*
Given n = 5, and version = 4 is the first bad version.

call isBadVersion(3) -> false
call isBadVersion(5) -> true
call isBadVersion(4) -> true

Then 4 is the first bad version.
 */
public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int result = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid)) {
                start = mid + 1;
            } else {
                result = mid;
                end = mid - 1;
            }
        }

        return result;
    }

    private boolean isBadVersion(int n) {
        int badVersion = 1;
        return badVersion == n;
    }
}
/*
Нужно искать первую плохую версию от 1 до принятой в параметре.
Рассматриваем версии как отсортированый массив и используем бинарный поиск
только среднее значение здесь ищется по формуле int mid = start + (end - start) / 2;
Таким образом мы понимаем, что нашли нужную версию, когда значение start становится больше end
 */