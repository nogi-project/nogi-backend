package kr.co.nogibackend.interfaces.user.dto;

import kr.co.nogibackend.domain.user.dto.info.UserInfo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {

  private Long id;
  private String notionBotToken;
  private String notionDatabaseId;
  private String githubAuthToken;
  private String githubRepository;
  private String githubDefaultBranch;
  private String githubEmail;
  private String githubOwner;
  private Boolean isNotificationAllowed;

  public static UserResponse from(UserInfo userInfo) {
    return UserResponse.builder()
        .id(userInfo.id())
        .notionBotToken(userInfo.notionBotToken())
        .notionDatabaseId(userInfo.notionDatabaseId())
        .githubAuthToken(userInfo.githubAuthToken())
        .githubRepository(userInfo.githubRepository())
        .githubDefaultBranch(userInfo.githubDefaultBranch())
        .githubEmail(userInfo.githubEmail())
        .githubOwner(userInfo.githubOwner())
        .isNotificationAllowed(userInfo.isNotificationAllowed())
        .build();
  }

}
