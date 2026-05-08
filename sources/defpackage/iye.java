package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.accessibility.CaptioningManager;
import androidx.media3.ui.PlayerView;
import androidx.media3.ui.SubtitleView;

/* JADX INFO: loaded from: classes3.dex */
public final class iye {
    public static void a(PlayerView playerView, Context context) {
        playerView.getClass();
        context.getClass();
        SubtitleView subtitleView = playerView.getSubtitleView();
        if (subtitleView != null) {
            subtitleView.setApplyEmbeddedStyles(false);
            subtitleView.setApplyEmbeddedFontSizes(false);
            Object systemService = context.getSystemService("captioning");
            CaptioningManager captioningManager = systemService instanceof CaptioningManager ? (CaptioningManager) systemService : null;
            CaptioningManager.CaptionStyle userStyle = captioningManager != null ? captioningManager.getUserStyle() : null;
            if (userStyle != null) {
                subtitleView.setStyle(gx1.a(userStyle));
                float fontScale = captioningManager.getFontScale() * 16.0f;
                Context context2 = subtitleView.getContext();
                float fApplyDimension = TypedValue.applyDimension(2, fontScale, (context2 == null ? Resources.getSystem() : context2.getResources()).getDisplayMetrics());
                subtitleView.c = 2;
                subtitleView.d = fApplyDimension;
                subtitleView.c();
            }
        }
    }
}
