package com.test.custom.service;

import com.liferay.journal.model.JournalArticle;
import com.liferay.journal.service.JournalArticleServiceWrapper;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceWrapper;

import java.io.File;
import java.util.Locale;
import java.util.Map;

import org.osgi.service.component.annotations.Component;

/**
 * @author Zeenesh
 */
@Component(
	immediate = true,
	property = {
	},
	service = ServiceWrapper.class
)
public class CustomJournalArticleServiceWrapper extends JournalArticleServiceWrapper {

	private static final Log log = LogFactoryUtil.getLog(CustomJournalArticleServiceWrapper.class);
	
	public CustomJournalArticleServiceWrapper() {
		super(null);
	}
	
	
	@Override
	public JournalArticle addArticle(String externalReferenceCode, long groupId, long folderId, long classNameId,
			long classPK, String articleId, boolean autoArticleId, Map<Locale, String> titleMap,
			Map<Locale, String> descriptionMap, Map<Locale, String> friendlyURLMap, String content,
			String ddmStructureKey, String ddmTemplateKey, String layoutUuid, int displayDateMonth, int displayDateDay,
			int displayDateYear, int displayDateHour, int displayDateMinute, int expirationDateMonth,
			int expirationDateDay, int expirationDateYear, int expirationDateHour, int expirationDateMinute,
			boolean neverExpire, int reviewDateMonth, int reviewDateDay, int reviewDateYear, int reviewDateHour,
			int reviewDateMinute, boolean neverReview, boolean indexable, boolean smallImage, String smallImageURL,
			File smallFile, Map<String, byte[]> images, String articleURL, ServiceContext serviceContext)
			throws PortalException {
		
		log.info("Custom service wrapper is invoked"+titleMap);
		
		
		return super.addArticle(externalReferenceCode, groupId, folderId, classNameId, classPK, articleId, autoArticleId,
				titleMap, descriptionMap, friendlyURLMap, content, ddmStructureKey, ddmTemplateKey, layoutUuid,
				displayDateMonth, displayDateDay, displayDateYear, displayDateHour, displayDateMinute, expirationDateMonth,
				expirationDateDay, expirationDateYear, expirationDateHour, expirationDateMinute, neverExpire, reviewDateMonth,
				reviewDateDay, reviewDateYear, reviewDateHour, reviewDateMinute, neverReview, indexable, smallImage,
				smallImageURL, smallFile, images, articleURL, serviceContext);
	}

}