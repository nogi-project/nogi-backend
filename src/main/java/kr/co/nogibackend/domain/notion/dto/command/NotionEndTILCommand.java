package kr.co.nogibackend.domain.notion.dto.command;

public record NotionEndTILCommand(
	Long userId,// 유저 ID
	String notionAuthToken, // notion auth token
	String notionPageId, // notion page id
	String category,// 디렉터리 하위 구조
	String title,// 제목(ex 파일명.md 에서 파일명으로 사용할 값)
	boolean isSuccess// 성공여부
) {
}
