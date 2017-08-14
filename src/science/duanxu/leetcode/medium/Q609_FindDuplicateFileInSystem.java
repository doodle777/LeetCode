package science.duanxu.leetcode.medium;

import java.util.*;

/**
 * 609. Find Duplicate File in System
 *
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q609_FindDuplicateFileInSystem {
    /**
     * Input:
     * ["root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"]
     * Output:
     * [["root/a/2.txt","root/c/d/4.txt","root/4.txt"],["root/a/1.txt","root/c/3.txt"]]
     */
    private class File {
        String path;
        String fileName;
        String content;

        File(String path, String name, String content) {
            this.path = path;
            this.fileName = name;
            this.content = content;
        }

        @Override
        public String toString() {
            return path + "/" + fileName;
        }
    }
//    private final Pattern pattern = Pattern.compile("(.*)\\((.*)\\)");
    /**
     * 计算系统中重复文件
     * @param paths 路径
     * @return 重复文件
     */
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<File>> map = new HashMap<>();

        for (String path : paths) {
            String[] files = path.split(" ");
            String rootPath = files[0];

            for (int i = 1; i < files.length; i++) {
//                Matcher matcher = pattern.matcher(files[i]);
//                String fileName = matcher.group(0);
//                String content = matcher.group(1);
                String[] splits = files[i].split("\\(|\\)");
                String fileName = splits[0];
                String content = splits[1];

                File file = new File(rootPath, fileName, content);

                List<File> sameContentList = map.getOrDefault(content, new ArrayList<>());
                sameContentList.add(file);
                map.put(content, sameContentList);
            }
        }
        List<List<String>> result = new ArrayList<>();
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            List<File> value = (List<File>) entry.getValue();
            if (value.size() > 1) {
                List<String> fileNames = new ArrayList<>();
                for (File file : value) {
                    fileNames.add(file.toString());
                }
                result.add(fileNames);
            }
        }

        return result;
    }
}
