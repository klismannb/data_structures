import java.util.*;

class Solution {

	public static String simplifyPath(String path) {
		List<String> pathList = Arrays.asList(path.split("/"));
		Stack<String> stackPath = new Stack<>();

		for (int i = 0; i < pathList.size(); i++) {

			if (pathList.get(i).equals("..")) {
				if (stackPath.empty()) {
					continue;
				} else {
					stackPath.pop();
				}
			} else if (pathList.get(i).equals(".")) {
				continue;
			} else {

				if (!pathList.get(i).isEmpty())
					stackPath.add(pathList.get(i));
			}
		}

		Stack<String> revStack = new Stack<>();

		while (!stackPath.empty()) {
			revStack.add(stackPath.pop());
		}

		String finalPath = "";

		while (!revStack.empty()) {
			finalPath += "/" + revStack.pop();
		}

		return finalPath.length() == 0 ? "/" : finalPath;
	}

	public static void main(String[] args) {
		System.out.println(Solution.simplifyPath("/home/"));
		System.out.println(Solution.simplifyPath("/home//foo/"));
		System.out.println(Solution.simplifyPath("/home/user/Documents/../Pictures"));
		System.out.println(Solution.simplifyPath("/../"));
		System.out.println(Solution.simplifyPath("/.../a/../b/c/../d/./"));
	}
}
