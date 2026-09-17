class Solution {
    public String simplifyPath(String path) {
        Deque<String> stack = new ArrayDeque<>();

        for (String part : path.split("/")) {
            if (part.equals("") || part.equals("."))
                continue;
            else if (part.equals("..")) {
                stack.pollLast();
            } else {
                stack.addLast(part);
            }
        }

        return stack.isEmpty() ? "/" : "/" + String.join("/", stack);    
    }
}
