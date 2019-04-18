package main.java.HomeWork.hw3.task2;

/*
    Task 2
 */

public class StagePlay {
    private String[] roles;
    private String[] textLines;
    private String[] groupedText;

    public StagePlay() {
        initInputStrings();
    }

    public void printGroupedText() {
        for (String str : groupedText) {
            System.out.println(str);
        }
    }

    public void groupTextByRoles() {
        for (int i = 0; i < roles.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(roles[i]).append(":\n");
            for (int j = 0; j < textLines.length; j++) {
                String[] splitedLine = textLines[j].split(":", 2);
                if (roles[i].equals(splitedLine[0])) {
                    sb.append(j + 1).append(") ").append(splitedLine[1]).append("\n");
                }
            }
            groupedText[i] = sb.toString();
        }
    }

    private void initInputStrings() {
        roles = new String[]{
                "Городничий",
                "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"
        };
        textLines = new String[]{
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"
        };
        groupedText = new String[roles.length];
    }
}
