package kr.co.nogibackend.domain.notion.dto.content;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotionTodoContent {

  private List<NotionRichTextContent> rich_text;
  private boolean checked;
  private String color;

}
