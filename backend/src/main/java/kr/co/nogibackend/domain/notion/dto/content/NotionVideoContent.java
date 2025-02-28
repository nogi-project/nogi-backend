package kr.co.nogibackend.domain.notion.dto.content;

import kr.co.nogibackend.domain.notion.dto.property.NotionFileProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class NotionVideoContent {

  private String type;
  private NotionFileProperty external;

}
