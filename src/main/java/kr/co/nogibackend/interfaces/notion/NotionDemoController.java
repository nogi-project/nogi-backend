package kr.co.nogibackend.interfaces.notion;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kr.co.nogibackend.domain.notion.NotionService;
import kr.co.nogibackend.domain.notion.dto.command.NotionEndTILCommand;
import kr.co.nogibackend.domain.notion.dto.command.NotionStartTILCommand;
import kr.co.nogibackend.domain.user.User;
import kr.co.nogibackend.response.service.Response;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/samples")
@RequiredArgsConstructor
public class NotionDemoController {

	private final NotionService notionService;

	@GetMapping("/demo/notion")
	public ResponseEntity<?> getNotion(
		@RequestParam("authToken") String authToken,
		@RequestParam("databaseId") String databaseId
	) {
		User user = User.builder().notionAuthToken(authToken).notionDatabaseId(databaseId).build();
		return Response.success(
			notionService.startTIL(NotionStartTILCommand
				.builder()
				.notionAuthToken(user.getNotionAuthToken())
				.notionDatabaseId(user.getNotionDatabaseId())
				.build())
		);
	}

	@GetMapping("/demo/notion/update")
	public ResponseEntity<?> getNotionUpdate(
		@RequestParam("authToken") String authToken,
		@RequestParam("pageId") String pageId
	) {
		return Response.success(
			notionService.endTIL(
				new NotionEndTILCommand(
					1L,
					authToken,
					pageId,
					"category",
					"title",
					true
				)
			)
		);
	}

}
