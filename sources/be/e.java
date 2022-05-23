package be;

import ae.a0;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import ra.g;

public class e extends a0 {
    public e() {
        this(0, 1, null);
    }

    public e(int i10) {
        super(i10);
    }

    @Override
    public float d(int i10) {
        switch (i10) {
            case R.id.theme_property_bubbleCorner:
                return 18.0f;
            case R.id.theme_property_bubbleCornerLegacy:
            case R.id.theme_property_bubbleCornerMerged:
                return 6.0f;
            case R.id.theme_property_bubbleDateCorner:
            case R.id.theme_property_dateCorner:
                return 13.0f;
            case R.id.theme_property_bubbleOuterMargin:
                return 8.0f;
            case R.id.theme_property_bubbleOutline:
            case R.id.theme_property_bubbleUnreadShadow:
            case R.id.theme_property_dark:
            case R.id.theme_property_lightStatusBar:
            case R.id.theme_property_parentTheme:
            case R.id.theme_property_replaceShadowsWithSeparators:
            case R.id.theme_property_wallpaperUsageId:
                return 0.0f;
            case R.id.theme_property_bubbleOutlineSize:
            case R.id.theme_property_wallpaperOverrideButton:
            case R.id.theme_property_wallpaperOverrideDate:
            case R.id.theme_property_wallpaperOverrideMediaReply:
            case R.id.theme_property_wallpaperOverrideOverlay:
            case R.id.theme_property_wallpaperOverrideTime:
            case R.id.theme_property_wallpaperOverrideUnread:
                return 1.0f;
            case R.id.theme_property_imageCorner:
                return 3.0f;
            case R.id.theme_property_shadowDepth:
                return 0.5f;
            case R.id.theme_property_subtitleAlpha:
                return 0.8f;
            case R.id.theme_property_wallpaperId:
            default:
                return super.d(i10);
        }
    }

    @Override
    public int e(int i10) {
        switch (i10) {
            case R.id.theme_color_attachContact:
                return -1870731;
            case R.id.theme_color_attachFile:
            case R.id.theme_color_fileYellow:
                return -938413;
            case R.id.theme_color_attachInlineBot:
                return -8747063;
            case R.id.theme_color_attachLocation:
            case R.id.theme_color_fileGreen:
                return -9848211;
            case R.id.theme_color_attachPhoto:
                return -9914637;
            case R.id.theme_color_attachText:
            case R.id.theme_color_avatar_content:
            case R.id.theme_color_badgeFailedText:
            case R.id.theme_color_badgeMutedText:
            case R.id.theme_color_badgeText:
            case R.id.theme_color_bubbleIn_background:
            case R.id.theme_color_bubbleOut_chatCorrectChosenFillingContent:
            case R.id.theme_color_bubbleOut_chatCorrectFillingContent:
            case R.id.theme_color_bubbleOut_chatNegativeFillingContent:
            case R.id.theme_color_bubbleOut_chatNeutralFillingContent:
            case R.id.theme_color_bubble_buttonText:
            case R.id.theme_color_bubble_buttonText_noWallpaper:
            case R.id.theme_color_bubble_dateText:
            case R.id.theme_color_bubble_dateText_noWallpaper:
            case R.id.theme_color_bubble_mediaOverlayText:
            case R.id.theme_color_bubble_mediaReplyText:
            case R.id.theme_color_bubble_mediaReplyText_noWallpaper:
            case R.id.theme_color_bubble_mediaTimeText:
            case R.id.theme_color_bubble_mediaTimeText_noWallpaper:
            case R.id.theme_color_bubble_messageCheckOutline:
            case R.id.theme_color_bubble_overlayText:
            case R.id.theme_color_bubble_overlayText_noWallpaper:
            case R.id.theme_color_bubble_unreadText:
            case R.id.theme_color_bubble_unreadText_noWallpaper:
            case R.id.theme_color_chatBackground:
            case R.id.theme_color_checkContent:
            case R.id.theme_color_circleButtonActiveIcon:
            case R.id.theme_color_circleButtonChat:
            case R.id.theme_color_circleButtonNegativeIcon:
            case R.id.theme_color_circleButtonNewChannelIcon:
            case R.id.theme_color_circleButtonNewChatIcon:
            case R.id.theme_color_circleButtonNewGroupIcon:
            case R.id.theme_color_circleButtonNewSecretIcon:
            case R.id.theme_color_circleButtonOverlay:
            case R.id.theme_color_circleButtonPositiveIcon:
            case R.id.theme_color_circleButtonRegularIcon:
            case R.id.theme_color_circleButtonThemeIcon:
            case R.id.theme_color_controlContent:
            case R.id.theme_color_filling:
            case R.id.theme_color_fillingPositiveContent:
            case R.id.theme_color_headerButton:
            case R.id.theme_color_headerIcon:
            case R.id.theme_color_headerLightBackground:
            case R.id.theme_color_headerTabActive:
            case R.id.theme_color_headerTabActiveText:
            case R.id.theme_color_headerText:
            case R.id.theme_color_inlineContentActive:
            case R.id.theme_color_messageCorrectChosenFillingContent:
            case R.id.theme_color_messageCorrectFillingContent:
            case R.id.theme_color_messageNegativeLineContent:
            case R.id.theme_color_messageNeutralFillingContent:
            case R.id.theme_color_messageSwipeContent:
            case R.id.theme_color_overlayFilling:
            case R.id.theme_color_passcodeIcon:
            case R.id.theme_color_passcodeText:
            case R.id.theme_color_promoContent:
            case R.id.theme_color_snackbarUpdateAction:
            case R.id.theme_color_snackbarUpdateText:
            case R.id.theme_color_statusBarContent:
            case R.id.theme_color_statusBarLegacyContent:
            case R.id.theme_color_togglerNegativeContent:
            case R.id.theme_color_togglerPositiveContent:
            case R.id.theme_color_tooltip_text:
            case R.id.theme_color_videoSliderActive:
            case R.id.theme_color_white:
                return -1;
            case R.id.theme_color_avatarArchive:
            case R.id.theme_color_avatarReplies:
            case R.id.theme_color_avatarReplies_big:
            case R.id.theme_color_avatarSavedMessages:
            case R.id.theme_color_avatarSavedMessages_big:
            case R.id.theme_color_tooltip_textLink:
                return -10376735;
            case R.id.theme_color_avatarArchivePinned:
            case R.id.theme_color_avatarInactive:
            case R.id.theme_color_avatarInactive_big:
                return -5393994;
            case R.id.theme_color_avatarBlue:
            case R.id.theme_color_avatarBlue_big:
            case R.id.theme_color_nameBlue:
                return -10576684;
            case R.id.theme_color_avatarCyan:
            case R.id.theme_color_avatarCyan_big:
            case R.id.theme_color_nameCyan:
                return -10175794;
            case R.id.theme_color_avatarGreen:
            case R.id.theme_color_avatarGreen_big:
            case R.id.theme_color_bubbleOut_messageAuthorPsa:
            case R.id.theme_color_messageAuthorPsa:
            case R.id.theme_color_nameGreen:
                return -8733864;
            case R.id.theme_color_avatarOrange:
            case R.id.theme_color_avatarOrange_big:
            case R.id.theme_color_nameOrange:
                return -880300;
            case R.id.theme_color_avatarPink:
            case R.id.theme_color_avatarPink_big:
            case R.id.theme_color_namePink:
                return -2524765;
            case R.id.theme_color_avatarRed:
            case R.id.theme_color_avatarRed_big:
            case R.id.theme_color_nameRed:
                return -1089188;
            case R.id.theme_color_avatarViolet:
            case R.id.theme_color_avatarViolet_big:
                return -7108383;
            case R.id.theme_color_avatarYellow:
            case R.id.theme_color_avatarYellow_big:
            case R.id.theme_color_nameYellow:
                return -676547;
            case R.id.theme_color_background:
            case R.id.theme_color_iv_chatLinkBackground:
            case R.id.theme_color_iv_textReferenceBackground:
                return -855310;
            case R.id.theme_color_background_icon:
                return -6446683;
            case R.id.theme_color_background_text:
                return -9340802;
            case R.id.theme_color_background_textLight:
                return -8617336;
            case R.id.theme_color_badge:
                return -14043402;
            case R.id.theme_color_badgeFailed:
                return -2937041;
            case R.id.theme_color_badgeMuted:
                return -4275513;
            case R.id.theme_color_black:
            case R.id.theme_color_bubbleIn_text:
            case R.id.theme_color_bubbleOut_text:
            case R.id.theme_color_ivHeader:
            case R.id.theme_color_iv_blockQuoteLine:
            case R.id.theme_color_iv_header:
            case R.id.theme_color_iv_pageTitle:
            case R.id.theme_color_iv_text:
            case R.id.theme_color_iv_textMarked:
            case R.id.theme_color_iv_textReference:
            case R.id.theme_color_playerButton:
            case R.id.theme_color_text:
            case R.id.theme_color_themeBlackWhite:
                return -16777216;
            case R.id.theme_color_bubbleIn_outline:
            case R.id.theme_color_bubbleOut_outline:
                return -4272160;
            case R.id.theme_color_bubbleIn_pressed:
            case R.id.theme_color_bubbleOut_pressed:
                return 268435456;
            case R.id.theme_color_bubbleIn_progress:
            case R.id.theme_color_chatSendButton:
            case R.id.theme_color_progress:
                return -14767375;
            case R.id.theme_color_bubbleIn_separator:
            case R.id.theme_color_chatSeparator:
            case R.id.theme_color_inputInactive:
            case R.id.theme_color_iv_separator:
            case R.id.theme_color_separator:
                return -2169878;
            case R.id.theme_color_bubbleIn_textLink:
            case R.id.theme_color_bubbleOut_textLink:
            case R.id.theme_color_iv_textLink:
            case R.id.theme_color_iv_textMarkedLink:
            case R.id.theme_color_textLink:
                return -11101490;
            case R.id.theme_color_bubbleIn_textLinkPressHighlight:
            case R.id.theme_color_bubbleOut_textLinkPressHighlight:
            case R.id.theme_color_iv_textLinkPressHighlight:
            case R.id.theme_color_textLinkPressHighlight:
                return 810982094;
            case R.id.theme_color_bubbleIn_time:
            case R.id.theme_color_textPlaceholder:
                return -6182221;
            case R.id.theme_color_bubbleOut_background:
                return -1772290;
            case R.id.theme_color_bubbleOut_chatCorrectChosenFilling:
            case R.id.theme_color_bubbleOut_chatCorrectFilling:
            case R.id.theme_color_bubbleOut_chatVerticalLine:
            case R.id.theme_color_bubbleOut_inlineIcon:
            case R.id.theme_color_inlineIcon:
            case R.id.theme_color_messageCorrectChosenFilling:
            case R.id.theme_color_messageCorrectFilling:
            case R.id.theme_color_messageVerticalLine:
                return -11490593;
            case R.id.theme_color_bubbleOut_chatNegativeFilling:
            case R.id.theme_color_fillingNegative:
            case R.id.theme_color_messageNegativeLine:
                return -1289132;
            case R.id.theme_color_bubbleOut_file:
            case R.id.theme_color_file:
                return -11229466;
            case R.id.theme_color_bubbleOut_inlineOutline:
            case R.id.theme_color_inlineOutline:
                return -14376228;
            case R.id.theme_color_bubbleOut_inlineText:
            case R.id.theme_color_bubbleOut_messageAuthor:
            case R.id.theme_color_inlineText:
            case R.id.theme_color_messageAuthor:
                return -14117673;
            case R.id.theme_color_bubbleOut_progress:
            case R.id.theme_color_bubbleOut_separator:
            case R.id.theme_color_bubbleOut_time:
                return -8280898;
            case R.id.theme_color_bubbleOut_ticks:
            case R.id.theme_color_bubbleOut_ticksRead:
                return -12414253;
            case R.id.theme_color_bubbleOut_waveformActive:
            case R.id.theme_color_waveformActive:
                return -9916959;
            case R.id.theme_color_bubbleOut_waveformInactive:
            case R.id.theme_color_waveformInactive:
                return -2759185;
            case R.id.theme_color_bubble_button:
            case R.id.theme_color_bubble_buttonRipple:
            case R.id.theme_color_bubble_buttonRipple_noWallpaper:
            case R.id.theme_color_bubble_button_noWallpaper:
            case R.id.theme_color_bubble_date:
            case R.id.theme_color_bubble_date_noWallpaper:
            case R.id.theme_color_bubble_mediaOverlay:
            case R.id.theme_color_bubble_mediaReply:
            case R.id.theme_color_bubble_mediaReply_noWallpaper:
            case R.id.theme_color_bubble_mediaTime:
            case R.id.theme_color_bubble_mediaTime_noWallpaper:
            case R.id.theme_color_bubble_overlay:
            case R.id.theme_color_bubble_overlay_noWallpaper:
            case R.id.theme_color_bubble_unread:
            case R.id.theme_color_bubble_unread_noWallpaper:
                return Log.TAG_TDLIB_OPTIONS;
            case R.id.theme_color_bubble_chatBackground:
            case R.id.theme_color_drawer:
            case R.id.theme_color_drawerText:
            case R.id.theme_color_headerPickerBackground:
            case R.id.theme_color_headerPickerText:
            case R.id.theme_color_sectionedScrollBarActive:
            case R.id.theme_color_sectionedScrollBarActiveContent:
            case R.id.theme_color_tooltip_outline:
                return 0;
            case R.id.theme_color_bubble_chatSeparator:
            case R.id.theme_color_shareSeparator:
                return -1428233238;
            case R.id.theme_color_bubble_messageCheckOutlineNoWallpaper:
                return -10062980;
            case R.id.theme_color_bubble_messageSelection:
            case R.id.theme_color_bubble_messageSelectionNoWallpaper:
                return 859941358;
            case R.id.theme_color_caption_textLink:
                return -2434342;
            case R.id.theme_color_caption_textLinkPressHighlight:
                return 452984831;
            case R.id.theme_color_chatKeyboard:
                return -657416;
            case R.id.theme_color_chatKeyboardButton:
                return -1775639;
            case R.id.theme_color_chatListAction:
                return -16540699;
            case R.id.theme_color_chatListIcon:
            case R.id.theme_color_chatListMute:
                return -5130564;
            case R.id.theme_color_chatListVerify:
            case R.id.theme_color_sliderActive:
                return -11422224;
            case R.id.theme_color_checkActive:
                return -12473874;
            case R.id.theme_color_circleButtonActive:
            case R.id.theme_color_circleButtonRegular:
            case R.id.theme_color_circleButtonTheme:
            case R.id.theme_color_snackbarUpdate:
                return -11556378;
            case R.id.theme_color_circleButtonChatIcon:
            case R.id.theme_color_circleButtonOverlayIcon:
            case R.id.theme_color_controlInactive:
            case R.id.theme_color_headerLightIcon:
            case R.id.theme_color_icon:
            case R.id.theme_color_iv_icon:
            case R.id.theme_color_themeNightBlack:
                return -8551025;
            case R.id.theme_color_circleButtonNegative:
                return -2542012;
            case R.id.theme_color_circleButtonNewChannel:
                return -150997;
            case R.id.theme_color_circleButtonNewChat:
            case R.id.theme_color_inputNegative:
                return -1223596;
            case R.id.theme_color_circleButtonNewGroup:
                return -160219;
            case R.id.theme_color_circleButtonNewSecret:
                return -11489707;
            case R.id.theme_color_circleButtonPositive:
                return -10175913;
            case R.id.theme_color_confettiBlue:
                return -12153609;
            case R.id.theme_color_confettiCyan:
                return -10634524;
            case R.id.theme_color_confettiGreen:
                return -9259660;
            case R.id.theme_color_confettiPurple:
                return -7330359;
            case R.id.theme_color_confettiRed:
                return -1491365;
            case R.id.theme_color_confettiYellow:
                return -603322;
            case R.id.theme_color_controlActive:
            case R.id.theme_color_themeBlue:
            case R.id.theme_color_themeClassic:
                return -13256717;
            case R.id.theme_color_fileAttach:
                return -3023638;
            case R.id.theme_color_fileRed:
                return -1674894;
            case R.id.theme_color_fillingPositive:
                return -10377248;
            case R.id.theme_color_fillingPressed:
                return -789517;
            case R.id.theme_color_headerBackground:
            case R.id.theme_color_notification:
            case R.id.theme_color_notificationLink:
            case R.id.theme_color_notificationPlayer:
            case R.id.theme_color_passcode:
                return -12614735;
            case R.id.theme_color_headerBarCallActive:
                return -8797702;
            case R.id.theme_color_headerBarCallIncoming:
                return -16006309;
            case R.id.theme_color_headerBarCallMuted:
                return -7432546;
            case R.id.theme_color_headerButtonIcon:
                return -8551026;
            case R.id.theme_color_headerLightText:
                return -8485490;
            case R.id.theme_color_headerPlaceholder:
                return Log.TAG_TDLIB_FILES;
            case R.id.theme_color_headerRemoveBackground:
                return -5282716;
            case R.id.theme_color_headerRemoveBackgroundHighlight:
                return -2392706;
            case R.id.theme_color_headerTabInactiveText:
                return -855638017;
            case R.id.theme_color_iconActive:
            case R.id.theme_color_ticks:
            case R.id.theme_color_ticksRead:
                return -13523479;
            case R.id.theme_color_iconLight:
                return -5985357;
            case R.id.theme_color_iconNegative:
                return -1950409;
            case R.id.theme_color_iconPositive:
                return -11553960;
            case R.id.theme_color_inputActive:
                return -10241289;
            case R.id.theme_color_inputPositive:
            case R.id.theme_color_notificationSecure:
            case R.id.theme_color_textSecure:
                return -15161313;
            case R.id.theme_color_introSection:
                return -2171170;
            case R.id.theme_color_introSectionActive:
                return -7697777;
            case R.id.theme_color_ivHeaderIcon:
                return -8355712;
            case R.id.theme_color_iv_blockQuote:
                return -13421773;
            case R.id.theme_color_iv_caption:
            case R.id.theme_color_iv_pageAuthor:
            case R.id.theme_color_iv_pageFooter:
                return -8813941;
            case R.id.theme_color_iv_chatLinkOverlayBackground:
                return -1442840576;
            case R.id.theme_color_iv_pageSubtitle:
                return -9011320;
            case R.id.theme_color_iv_preBlockBackground:
                return -657156;
            case R.id.theme_color_iv_pullQuote:
                return -10066330;
            case R.id.theme_color_iv_textCode:
                return -3795177;
            case R.id.theme_color_iv_textCodeBackground:
                return -70940;
            case R.id.theme_color_iv_textCodeBackgroundPressed:
                return -334112;
            case R.id.theme_color_iv_textMarkedBackground:
            case R.id.theme_color_iv_textMarkedLinkPressHighlight:
                return 2013265664;
            case R.id.theme_color_iv_textReferenceBackgroundPressed:
                return -2039584;
            case R.id.theme_color_iv_textReferenceOutline:
                return 1996488704;
            case R.id.theme_color_iv_textReferenceOutlinePressed:
                return -1728053248;
            case R.id.theme_color_ledBlue:
                return -12140801;
            case R.id.theme_color_ledCyan:
                return -12521994;
            case R.id.theme_color_ledGreen:
                return -8792480;
            case R.id.theme_color_ledOrange:
                return -29183;
            case R.id.theme_color_ledPink:
                return -45162;
            case R.id.theme_color_ledPurple:
                return -2984711;
            case R.id.theme_color_ledRed:
                return -1031100;
            case R.id.theme_color_ledWhite:
                return -4473925;
            case R.id.theme_color_ledYellow:
                return -12769;
            case R.id.theme_color_messageSelection:
                return 270836444;
            case R.id.theme_color_messageSwipeBackground:
                return -9720352;
            case R.id.theme_color_nameInactive:
                return -8882056;
            case R.id.theme_color_nameViolet:
                return -7108382;
            case R.id.theme_color_online:
                return -11220381;
            case R.id.theme_color_photoHighlightTint1:
                return -1076602;
            case R.id.theme_color_photoHighlightTint2:
                return -1388894;
            case R.id.theme_color_photoHighlightTint3:
                return -859780;
            case R.id.theme_color_photoHighlightTint4:
                return -5968466;
            case R.id.theme_color_photoHighlightTint5:
                return -7742235;
            case R.id.theme_color_photoHighlightTint6:
                return -13726776;
            case R.id.theme_color_photoHighlightTint7:
                return -3303195;
            case R.id.theme_color_photoShadowTint1:
                return -45747;
            case R.id.theme_color_photoShadowTint2:
                return -753630;
            case R.id.theme_color_photoShadowTint3:
                return -13056;
            case R.id.theme_color_photoShadowTint4:
                return -8269183;
            case R.id.theme_color_photoShadowTint5:
                return -9321002;
            case R.id.theme_color_photoShadowTint6:
                return -16747844;
            case R.id.theme_color_photoShadowTint7:
                return -10080879;
            case R.id.theme_color_placeholder:
                return 201326592;
            case R.id.theme_color_playerButtonActive:
                return -10901278;
            case R.id.theme_color_playerCoverIcon:
                return -7038302;
            case R.id.theme_color_playerCoverPlaceholder:
                return -1315602;
            case R.id.theme_color_previewBackground:
                return -1056964609;
            case R.id.theme_color_profileSectionActive:
                return -11552534;
            case R.id.theme_color_profileSectionActiveContent:
                return -14967582;
            case R.id.theme_color_promo:
            case R.id.theme_color_togglerActive:
            case R.id.theme_color_togglerPositive:
                return -11949595;
            case R.id.theme_color_sectionedScrollBar:
                return 1140850688;
            case R.id.theme_color_seekDone:
                return -10508839;
            case R.id.theme_color_seekEmpty:
                return -1249810;
            case R.id.theme_color_seekReady:
                return -2826782;
            case R.id.theme_color_sliderInactive:
                return -5130822;
            case R.id.theme_color_statusBar:
            case R.id.theme_color_statusBarLegacy:
                return 738197504;
            case R.id.theme_color_textLight:
                return -8156010;
            case R.id.theme_color_textNegative:
                return -1813674;
            case R.id.theme_color_textNeutral:
                return -12676140;
            case R.id.theme_color_textSearchQueryHighlight:
                return -12936740;
            case R.id.theme_color_textSelectionHighlight:
                return -5447436;
            case R.id.theme_color_themeCyan:
                return -16732991;
            case R.id.theme_color_themeGreen:
                return -12345273;
            case R.id.theme_color_themeNightBlue:
                return -12227949;
            case R.id.theme_color_themeOrange:
                return -291840;
            case R.id.theme_color_themePink:
                return -1023342;
            case R.id.theme_color_themeRed:
                return -1758935;
            case R.id.theme_color_themeWhiteBlack:
                return -5194043;
            case R.id.theme_color_togglerActiveBackground:
            case R.id.theme_color_togglerPositiveBackground:
                return -6171145;
            case R.id.theme_color_togglerInactive:
                return -1513240;
            case R.id.theme_color_togglerInactiveBackground:
                return -3684409;
            case R.id.theme_color_togglerNegative:
                return -1754827;
            case R.id.theme_color_togglerNegativeBackground:
                return -1074534;
            case R.id.theme_color_tooltip:
                return -587202560;
            case R.id.theme_color_tooltip_textLinkPressHighlight:
                return 1147251169;
            case R.id.theme_color_transparentEditor:
                return 1879048192;
            case R.id.theme_color_unread:
                return -1314057;
            case R.id.theme_color_unreadText:
                return -11035697;
            case R.id.theme_color_videoSliderInactive:
                return 1157627903;
            case R.id.theme_color_wp_cats:
            case R.id.theme_color_wp_circlesBlue:
                return 1718850476;
            case R.id.theme_color_wp_catsBeige:
                return 1718708048;
            case R.id.theme_color_wp_catsGreen:
                return 1717142589;
            case R.id.theme_color_wp_catsOrange:
                return 1721001791;
            case R.id.theme_color_wp_catsPink:
                return 1723168661;
            default:
                return super.e(i10);
        }
    }

    public e(int i10, int i11, g gVar) {
        this((i11 & 1) != 0 ? 1 : i10);
    }
}