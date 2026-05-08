package expo.modules.video;

import android.R;
import android.app.Activity;
import android.app.PictureInPictureParams;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.util.Rational;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g;
import androidx.media3.exoplayer.d;
import androidx.media3.ui.PlayerView;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.events.EventDispatcher;
import defpackage.c00;
import defpackage.ddb;
import defpackage.dmc;
import defpackage.dpf;
import defpackage.dqf;
import defpackage.dy4;
import defpackage.fwc;
import defpackage.gab;
import defpackage.gk0;
import defpackage.hye;
import defpackage.i07;
import defpackage.i45;
import defpackage.i73;
import defpackage.iab;
import defpackage.iwc;
import defpackage.iye;
import defpackage.j45;
import defpackage.j6g;
import defpackage.l45;
import defpackage.l4c;
import defpackage.lr5;
import defpackage.m45;
import defpackage.ma;
import defpackage.mog;
import defpackage.ojh;
import defpackage.qf8;
import defpackage.r40;
import defpackage.r6;
import defpackage.t40;
import defpackage.tog;
import defpackage.u63;
import defpackage.uh9;
import defpackage.v7;
import defpackage.vpg;
import defpackage.w92;
import defpackage.wk3;
import defpackage.wl7;
import defpackage.wpg;
import defpackage.wqf;
import defpackage.yng;
import defpackage.yo0;
import defpackage.z3;
import defpackage.z92;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.video.VideoView;
import expo.modules.video.enums.AudioMixingMode;
import expo.modules.video.enums.ContentFit;
import expo.modules.video.enums.PlayerStatus;
import expo.modules.video.player.VideoPlayer;
import expo.modules.video.records.AudioTrack;
import expo.modules.video.records.FullscreenOptions;
import expo.modules.video.records.PlaybackError;
import expo.modules.video.records.SubtitleTrack;
import expo.modules.video.records.TimeUpdate;
import expo.modules.video.records.VideoSource;
import expo.modules.video.records.VideoTrack;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 µ\u00012\u00020\u00012\u00020\u0002:\u0002¶\u0001B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\rJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\rJ\r\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\rJ\r\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\rJ\r\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\rJU\u0010!\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001a2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u000bH\u0016¢\u0006\u0004\b)\u0010\rJ7\u00100\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u00072\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+2\u0006\u0010.\u001a\u00020+2\u0006\u0010/\u001a\u00020+H\u0014¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u000bH\u0014¢\u0006\u0004\b2\u0010\rJ\u001f\u00106\u001a\u00020\u000b2\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020+H\u0014¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u000bH\u0014¢\u0006\u0004\b8\u0010\rJ\u0019\u0010;\u001a\u00020\u00072\b\u0010:\u001a\u0004\u0018\u000109H\u0016¢\u0006\u0004\b;\u0010<J\u0019\u0010=\u001a\u00020\u00072\b\u0010:\u001a\u0004\u0018\u000109H\u0016¢\u0006\u0004\b=\u0010<J\u0011\u0010?\u001a\u0004\u0018\u00010>H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020+2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u000bH\u0002¢\u0006\u0004\bC\u0010\rR\u0017\u0010E\u001a\u00020D8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010J\u001a\u00020I8\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR!\u0010S\u001a\b\u0012\u0004\u0012\u00020\u000b0N8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR!\u0010V\u001a\b\u0012\u0004\u0012\u00020\u000b0N8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bT\u0010P\u001a\u0004\bU\u0010RR!\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u000b0N8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bW\u0010P\u001a\u0004\bX\u0010RR!\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u000b0N8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010P\u001a\u0004\b[\u0010RR!\u0010_\u001a\b\u0012\u0004\u0012\u00020\u000b0N8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b]\u0010P\u001a\u0004\b^\u0010RR\"\u0010`\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010f\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010a\u001a\u0004\bg\u0010c\"\u0004\bh\u0010eR$\u0010j\u001a\u00020\u00072\u0006\u0010i\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bj\u0010a\u001a\u0004\bj\u0010cR$\u0010k\u001a\u00020\u00072\u0006\u0010i\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bk\u0010a\u001a\u0004\bl\u0010cR$\u0010m\u001a\u00020\u00072\u0006\u0010i\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bm\u0010a\u001a\u0004\bn\u0010cR\u0014\u0010p\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010r\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u001c\u0010v\u001a\n u*\u0004\u0018\u00010t0t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010y\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR$\u0010}\u001a\u0012\u0012\u0004\u0012\u00020+0{j\b\u0012\u0004\u0012\u00020+`|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0018\u0010\u007f\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010FR\u001c\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001c\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0083\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0018\u0010\u0087\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R&\u0010\u0089\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0089\u0001\u0010a\u001a\u0005\b\u008a\u0001\u0010c\"\u0005\b\u008b\u0001\u0010eR5\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u00072\b\u0010i\u001a\u0004\u0018\u00010\u00078\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R1\u0010\u0097\u0001\u001a\u00020\u00072\u0007\u0010\u0092\u0001\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0005\b\u0095\u0001\u0010c\"\u0005\b\u0096\u0001\u0010eR3\u0010\u0099\u0001\u001a\u00030\u0098\u00012\u0007\u0010i\u001a\u00030\u0098\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R5\u0010 \u0001\u001a\u0004\u0018\u00010\u00142\t\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u00148\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0005\b¤\u0001\u0010(R.\u0010¥\u0001\u001a\u00020\u00072\u0006\u0010i\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b¥\u0001\u0010a\u001a\u0005\b¦\u0001\u0010c\"\u0005\b§\u0001\u0010eR.\u0010¨\u0001\u001a\u00020\u00072\u0006\u0010i\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b¨\u0001\u0010a\u001a\u0005\b©\u0001\u0010c\"\u0005\bª\u0001\u0010eR3\u0010¬\u0001\u001a\u00030«\u00012\u0007\u0010i\u001a\u00030«\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b¬\u0001\u0010\u00ad\u0001\u001a\u0006\b®\u0001\u0010¯\u0001\"\u0006\b°\u0001\u0010±\u0001R\u0018\u0010³\u0001\u001a\u00030²\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001¨\u0006·\u0001"}, d2 = {"Lexpo/modules/video/VideoView;", "Lm45;", "Lmog;", "Landroid/content/Context;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "Lgk0;", "appContext", "", "useTextureView", "<init>", "(Landroid/content/Context;Lgk0;Z)V", "Lj6g;", "applySurfaceViewVisibility", "()V", "enterFullscreen", "attachPlayer", "exitFullscreen", "enterPictureInPicture", "layoutForPiPEnter", "layoutForPiPExit", "Lexpo/modules/video/player/VideoPlayer;", "player", "Lexpo/modules/video/records/VideoSource;", "videoSource", "", "duration", "", "Lexpo/modules/video/records/VideoTrack;", "availableVideoTracks", "Lexpo/modules/video/records/SubtitleTrack;", "availableSubtitleTracks", "Lexpo/modules/video/records/AudioTrack;", "availableAudioTracks", "onVideoSourceLoaded", "(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/records/VideoSource;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "Lwqf;", "tracks", "onTracksChanged", "(Lexpo/modules/video/player/VideoPlayer;Lwqf;)V", "onRenderedFirstFrame", "(Lexpo/modules/video/player/VideoPlayer;)V", "requestLayout", "changed", "", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "onAttachedToWindow", "Landroid/view/View;", "changedView", "visibility", "onVisibilityChanged", "(Landroid/view/View;I)V", "onDetachedFromWindow", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "onInterceptTouchEvent", "Landroid/util/Rational;", "calculateCurrentPipAspectRatio", "()Landroid/util/Rational;", "getPlayerViewLayoutId", "(Z)I", "setupCaptioningChangeListener", "", "videoViewId", "Ljava/lang/String;", "getVideoViewId", "()Ljava/lang/String;", "Landroidx/media3/ui/PlayerView;", "playerView", "Landroidx/media3/ui/PlayerView;", "getPlayerView", "()Landroidx/media3/ui/PlayerView;", "Lvpg;", "onPictureInPictureStart$delegate", "Lwpg;", "getOnPictureInPictureStart", "()Lvpg;", "onPictureInPictureStart", "onPictureInPictureStop$delegate", "getOnPictureInPictureStop", "onPictureInPictureStop", "onFullscreenEnter$delegate", "getOnFullscreenEnter", "onFullscreenEnter", "onFullscreenExit$delegate", "getOnFullscreenExit", "onFullscreenExit", "onFirstFrameRender$delegate", "getOnFirstFrameRender", "onFirstFrameRender", "willEnterPiP", "Z", "getWillEnterPiP", "()Z", "setWillEnterPiP", "(Z)V", "wasAutoPaused", "getWasAutoPaused", "setWasAutoPaused", "value", "isInFullscreen", "showsSubtitlesButton", "getShowsSubtitlesButton", "showsAudioTracksButton", "getShowsAudioTracksButton", "Landroid/app/Activity;", "currentActivity", "Landroid/app/Activity;", "decorView", "Landroid/view/View;", "Landroid/view/ViewGroup;", "kotlin.jvm.PlatformType", "rootView", "Landroid/view/ViewGroup;", "Ldpf;", "touchEventCoalescingKeyHelper", "Ldpf;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "rootViewChildrenOriginalVisibility", "Ljava/util/ArrayList;", "pictureInPictureHelperTag", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "reactNativeEventDispatcher", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "Landroid/view/accessibility/CaptioningManager$CaptioningChangeListener;", "captioningChangeListener", "Landroid/view/accessibility/CaptioningManager$CaptioningChangeListener;", "Landroid/view/View$OnFocusChangeListener;", "windowFocusChangeListener", "Landroid/view/View$OnFocusChangeListener;", "shouldHideSurfaceView", "getShouldHideSurfaceView", "setShouldHideSurfaceView", "useExoShutter", "Ljava/lang/Boolean;", "getUseExoShutter", "()Ljava/lang/Boolean;", "setUseExoShutter", "(Ljava/lang/Boolean;)V", "<set-?>", "autoEnterPiP$delegate", "Li07;", "getAutoEnterPiP", "setAutoEnterPiP", "autoEnterPiP", "Lexpo/modules/video/enums/ContentFit;", "contentFit", "Lexpo/modules/video/enums/ContentFit;", "getContentFit", "()Lexpo/modules/video/enums/ContentFit;", "setContentFit", "(Lexpo/modules/video/enums/ContentFit;)V", "newPlayer", "videoPlayer", "Lexpo/modules/video/player/VideoPlayer;", "getVideoPlayer", "()Lexpo/modules/video/player/VideoPlayer;", "setVideoPlayer", "useNativeControls", "getUseNativeControls", "setUseNativeControls", "allowsFullscreen", "getAllowsFullscreen", "setAllowsFullscreen", "Lexpo/modules/video/records/FullscreenOptions;", "fullscreenOptions", "Lexpo/modules/video/records/FullscreenOptions;", "getFullscreenOptions", "()Lexpo/modules/video/records/FullscreenOptions;", "setFullscreenOptions", "(Lexpo/modules/video/records/FullscreenOptions;)V", "Ljava/lang/Runnable;", "mLayoutRunnable", "Ljava/lang/Runnable;", "Companion", "a", "expo-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class VideoView extends m45 implements mog {
    static final /* synthetic */ qf8<Object>[] $$delegatedProperties;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private boolean allowsFullscreen;

    /* JADX INFO: renamed from: autoEnterPiP$delegate, reason: from kotlin metadata */
    private final i07 autoEnterPiP;
    private CaptioningManager.CaptioningChangeListener captioningChangeListener;
    private ContentFit contentFit;
    private final Activity currentActivity;
    private final View decorView;
    private FullscreenOptions fullscreenOptions;
    private boolean isInFullscreen;
    private final Runnable mLayoutRunnable;

    /* JADX INFO: renamed from: onFirstFrameRender$delegate, reason: from kotlin metadata */
    private final wpg onFirstFrameRender;

    /* JADX INFO: renamed from: onFullscreenEnter$delegate, reason: from kotlin metadata */
    private final wpg onFullscreenEnter;

    /* JADX INFO: renamed from: onFullscreenExit$delegate, reason: from kotlin metadata */
    private final wpg onFullscreenExit;

    /* JADX INFO: renamed from: onPictureInPictureStart$delegate, reason: from kotlin metadata */
    private final wpg onPictureInPictureStart;

    /* JADX INFO: renamed from: onPictureInPictureStop$delegate, reason: from kotlin metadata */
    private final wpg onPictureInPictureStop;
    private String pictureInPictureHelperTag;
    private final PlayerView playerView;
    private EventDispatcher reactNativeEventDispatcher;
    private final ViewGroup rootView;
    private final ArrayList<Integer> rootViewChildrenOriginalVisibility;
    private boolean shouldHideSurfaceView;
    private boolean showsAudioTracksButton;
    private boolean showsSubtitlesButton;
    private final dpf touchEventCoalescingKeyHelper;
    private Boolean useExoShutter;
    private boolean useNativeControls;
    private VideoPlayer videoPlayer;
    private final String videoViewId;
    private boolean wasAutoPaused;
    private boolean willEnterPiP;
    private final View.OnFocusChangeListener windowFocusChangeListener;

    /* JADX INFO: renamed from: expo.modules.video.VideoView$a, reason: from kotlin metadata */
    public static final class Companion {
    }

    static {
        l4c l4cVar = new l4c(VideoView.class, "onPictureInPictureStart", "getOnPictureInPictureStart()Lexpo/modules/kotlin/viewevent/ViewEventCallback;", 0);
        iwc iwcVar = fwc.a;
        $$delegatedProperties = new qf8[]{iwcVar.g(l4cVar), z3.i(VideoView.class, "onPictureInPictureStop", "getOnPictureInPictureStop()Lexpo/modules/kotlin/viewevent/ViewEventCallback;", 0, iwcVar), z3.i(VideoView.class, "onFullscreenEnter", "getOnFullscreenEnter()Lexpo/modules/kotlin/viewevent/ViewEventCallback;", 0, iwcVar), z3.i(VideoView.class, "onFullscreenExit", "getOnFullscreenExit()Lexpo/modules/kotlin/viewevent/ViewEventCallback;", 0, iwcVar), z3.i(VideoView.class, "onFirstFrameRender", "getOnFirstFrameRender()Lexpo/modules/kotlin/viewevent/ViewEventCallback;", 0, iwcVar), r40.b(VideoView.class, "autoEnterPiP", "getAutoEnterPiP()Z", 0, iwcVar)};
        INSTANCE = new Companion();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoView(final Context context, gk0 gk0Var, boolean z) throws CodedException {
        super(context, gk0Var);
        context.getClass();
        gk0Var.getClass();
        this.videoViewId = t40.h();
        View viewInflate = LayoutInflater.from(context.getApplicationContext()).inflate(getPlayerViewLayoutId(z), (ViewGroup) null);
        viewInflate.getClass();
        PlayerView playerView = (PlayerView) viewInflate;
        this.playerView = playerView;
        this.onPictureInPictureStart = new wpg(this);
        this.onPictureInPictureStop = new wpg(this);
        this.onFullscreenEnter = new wpg(this);
        this.onFullscreenExit = new wpg(this);
        this.onFirstFrameRender = new wpg(this);
        Activity activityE = gk0Var.e();
        this.currentActivity = activityE;
        View decorView = activityE.getWindow().getDecorView();
        decorView.getClass();
        this.decorView = decorView;
        this.rootView = (ViewGroup) decorView.findViewById(R.id.content);
        this.touchEventCoalescingKeyHelper = new dpf();
        this.rootViewChildrenOriginalVisibility = new ArrayList<>();
        this.windowFocusChangeListener = new View.OnFocusChangeListener() { // from class: wog
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                VideoView.windowFocusChangeListener$lambda$0(this.a, context, view, z2);
            }
        };
        this.shouldHideSurfaceView = true;
        this.autoEnterPiP = new i07(Boolean.FALSE, new yo0(this, 9));
        this.contentFit = ContentFit.CONTAIN;
        this.useNativeControls = true;
        this.allowsFullscreen = true;
        this.fullscreenOptions = new FullscreenOptions(false, null, false, 7, null);
        this.mLayoutRunnable = new v7(this, 6);
        yng.a.getClass();
        yng.c.put(getVideoViewId(), this);
        playerView.setFullscreenButtonClickListener(new i73(this, 11));
        playerView.setUseController(false);
        playerView.setShutterBackgroundColor(0);
        View videoSurfaceView = playerView.getVideoSurfaceView();
        if (videoSurfaceView != null) {
            videoSurfaceView.setAlpha(0.0f);
        }
        iye.a(playerView, context);
        addView(playerView, new ViewGroup.LayoutParams(-1, -1));
        ReactApplicationContext reactApplicationContextD = gk0Var.d();
        reactApplicationContextD.getClass();
        this.reactNativeEventDispatcher = dmc.d(reactApplicationContextD, getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g autoEnterPiP_delegate$lambda$1(VideoView videoView, boolean z, boolean z2) {
        iab.a(videoView.currentActivity, z, videoView.calculateCurrentPipAspectRatio());
        return j6g.a;
    }

    private final Rational calculateCurrentPipAspectRatio() {
        d dVar;
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer == null || (dVar = videoPlayer.X) == null) {
            return null;
        }
        dVar.y1();
        tog togVar = dVar.j0;
        togVar.getClass();
        return iab.b(togVar, getWidth(), getHeight(), this.contentFit);
    }

    private final int getPlayerViewLayoutId(boolean useTextureView) {
        return useTextureView ? com.indeed.android.jobsearch.R.layout.texture_player_view : com.indeed.android.jobsearch.R.layout.surface_player_view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mLayoutRunnable$lambda$6(VideoView videoView) {
        videoView.measure(View.MeasureSpec.makeMeasureSpec(videoView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(videoView.getHeight(), 1073741824));
        videoView.layout(videoView.getLeft(), videoView.getTop(), videoView.getRight(), videoView.getBottom());
    }

    private final void setupCaptioningChangeListener() {
        Object systemService = getContext().getSystemService("captioning");
        CaptioningManager captioningManager = systemService instanceof CaptioningManager ? (CaptioningManager) systemService : null;
        PlayerView playerView = this.playerView;
        Context context = getContext();
        context.getClass();
        playerView.getClass();
        hye hyeVar = new hye(playerView, context);
        this.captioningChangeListener = hyeVar;
        if (captioningManager != null) {
            captioningManager.addCaptioningChangeListener(hyeVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void windowFocusChangeListener$lambda$0(VideoView videoView, Context context, View view, boolean z) {
        if (z) {
            iye.a(videoView.playerView, context);
        }
    }

    public final void applySurfaceViewVisibility() {
        if (wl7.b(this.useExoShutter, Boolean.TRUE) || !this.shouldHideSurfaceView) {
            View videoSurfaceView = this.playerView.getVideoSurfaceView();
            if (videoSurfaceView != null) {
                videoSurfaceView.setAlpha(1.0f);
                return;
            }
            return;
        }
        View videoSurfaceView2 = this.playerView.getVideoSurfaceView();
        if (videoSurfaceView2 != null) {
            videoSurfaceView2.setAlpha(0.0f);
        }
    }

    public final void attachPlayer() {
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            videoPlayer.d0(this.playerView);
        }
    }

    public final void enterFullscreen() {
        Intent intent = new Intent(getContext(), (Class<?>) FullscreenPlayerActivity.class);
        intent.putExtra("player_uuid", this.videoViewId);
        intent.putExtra("fullscreen_options", this.fullscreenOptions);
        this.isInFullscreen = true;
        this.currentActivity.startActivity(intent);
        int i = Build.VERSION.SDK_INT;
        Activity activity = this.currentActivity;
        if (i >= 34) {
            activity.overrideActivityTransition(0, 0, 0);
        } else {
            activity.overridePendingTransition(0, 0);
        }
        getOnFullscreenEnter().invoke(j6g.a);
        iab.a(this.currentActivity, false, calculateCurrentPipAspectRatio());
    }

    public final void enterPictureInPicture() throws PictureInPictureEnterException, PictureInPictureUnsupportedException {
        Companion companion = INSTANCE;
        Activity activity = this.currentActivity;
        companion.getClass();
        activity.getClass();
        if (!activity.getPackageManager().hasSystemFeature("android.software.picture_in_picture")) {
            throw new PictureInPictureUnsupportedException();
        }
        if (this.playerView.getPlayer() == null) {
            throw new PictureInPictureEnterException("Failed to enter Picture in Picture mode".concat(". ".concat("No player attached to the VideoView")), null);
        }
        this.playerView.setUseController(false);
        iab.a(this.currentActivity, getAutoEnterPiP(), calculateCurrentPipAspectRatio());
        this.willEnterPiP = true;
        this.currentActivity.enterPictureInPictureMode(new PictureInPictureParams.Builder().build());
    }

    public final void exitFullscreen() {
        View viewFindViewById = this.playerView.findViewById(com.indeed.android.jobsearch.R.id.exo_fullscreen);
        viewFindViewById.getClass();
        ((ImageButton) viewFindViewById).setImageResource(2131231106);
        attachPlayer();
        getOnFullscreenExit().invoke(j6g.a);
        this.isInFullscreen = false;
        iab.a(this.currentActivity, getAutoEnterPiP(), calculateCurrentPipAspectRatio());
    }

    public final boolean getAllowsFullscreen() {
        return this.allowsFullscreen;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getAutoEnterPiP() {
        i07 i07Var = this.autoEnterPiP;
        qf8<Object> qf8Var = $$delegatedProperties[5];
        i07Var.getClass();
        qf8Var.getClass();
        return ((Boolean) i07Var.a).booleanValue();
    }

    public final ContentFit getContentFit() {
        return this.contentFit;
    }

    public final FullscreenOptions getFullscreenOptions() {
        return this.fullscreenOptions;
    }

    public final vpg<j6g> getOnFirstFrameRender() {
        return this.onFirstFrameRender.a(this, $$delegatedProperties[4]);
    }

    public final vpg<j6g> getOnFullscreenEnter() {
        return this.onFullscreenEnter.a(this, $$delegatedProperties[2]);
    }

    public final vpg<j6g> getOnFullscreenExit() {
        return this.onFullscreenExit.a(this, $$delegatedProperties[3]);
    }

    public final vpg<j6g> getOnPictureInPictureStart() {
        return this.onPictureInPictureStart.a(this, $$delegatedProperties[0]);
    }

    public final vpg<j6g> getOnPictureInPictureStop() {
        return this.onPictureInPictureStop.a(this, $$delegatedProperties[1]);
    }

    public final PlayerView getPlayerView() {
        return this.playerView;
    }

    public final boolean getShouldHideSurfaceView() {
        return this.shouldHideSurfaceView;
    }

    public final boolean getShowsAudioTracksButton() {
        return this.showsAudioTracksButton;
    }

    public final boolean getShowsSubtitlesButton() {
        return this.showsSubtitlesButton;
    }

    public final Boolean getUseExoShutter() {
        return this.useExoShutter;
    }

    public final boolean getUseNativeControls() {
        return this.useNativeControls;
    }

    public final VideoPlayer getVideoPlayer() {
        return this.videoPlayer;
    }

    public final String getVideoViewId() {
        return this.videoViewId;
    }

    public final boolean getWasAutoPaused() {
        return this.wasAutoPaused;
    }

    public final boolean getWillEnterPiP() {
        return this.willEnterPiP;
    }

    /* JADX INFO: renamed from: isInFullscreen, reason: from getter */
    public final boolean getIsInFullscreen() {
        return this.isInFullscreen;
    }

    public final void layoutForPiPEnter() {
        int i = 0;
        this.playerView.setUseController(false);
        ViewParent parent = this.playerView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this.playerView);
        }
        int childCount = this.rootView.getChildCount();
        while (true) {
            ViewGroup viewGroup2 = this.rootView;
            if (i >= childCount) {
                viewGroup2.addView(this.playerView, new FrameLayout.LayoutParams(-1, -1));
                return;
            }
            if (!wl7.b(viewGroup2.getChildAt(i), this.playerView)) {
                this.rootViewChildrenOriginalVisibility.add(Integer.valueOf(this.rootView.getChildAt(i).getVisibility()));
                this.rootView.getChildAt(i).setVisibility(8);
            }
            i++;
        }
    }

    public final void layoutForPiPExit() {
        this.playerView.setUseController(this.useNativeControls);
        this.rootView.removeView(this.playerView);
        int childCount = this.rootView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.rootView.getChildAt(i);
            Integer num = this.rootViewChildrenOriginalVisibility.get(i);
            num.getClass();
            childAt.setVisibility(num.intValue());
        }
        this.rootViewChildrenOriginalVisibility.clear();
        addView(this.playerView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Activity activity = this.currentActivity;
        g gVar = activity instanceof g ? (g) activity : null;
        if (gVar != null) {
            gab gabVar = new gab(this);
            String str = gabVar.b;
            this.pictureInPictureHelperTag = str;
            lr5 lr5VarU = gVar.u();
            lr5VarU.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(lr5VarU);
            aVar.d(0, gabVar, str, 1);
            aVar.h(true);
        }
        setupCaptioningChangeListener();
        PlayerView playerView = this.playerView;
        Context context = getContext();
        context.getClass();
        iye.a(playerView, context);
        this.decorView.setOnFocusChangeListener(this.windowFocusChangeListener);
        iab.a(this.currentActivity, getAutoEnterPiP(), null);
    }

    @Override // defpackage.mog
    public void onAudioMixingModeChanged(VideoPlayer videoPlayer, AudioMixingMode audioMixingMode, AudioMixingMode audioMixingMode2) {
        videoPlayer.getClass();
        audioMixingMode.getClass();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Activity activity = this.currentActivity;
        g gVar = activity instanceof g ? (g) activity : null;
        if (gVar != null) {
            lr5 lr5VarU = gVar.u();
            String str = this.pictureInPictureHelperTag;
            if (str == null) {
                str = "";
            }
            Fragment fragmentD = lr5VarU.D(str);
            if (fragmentD == null) {
                return;
            }
            lr5 lr5VarU2 = gVar.u();
            lr5VarU2.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(lr5VarU2);
            aVar.l(fragmentD);
            aVar.h(true);
        }
        CaptioningManager.CaptioningChangeListener captioningChangeListener = this.captioningChangeListener;
        if (captioningChangeListener != null) {
            Object systemService = getContext().getSystemService("captioning");
            CaptioningManager captioningManager = systemService instanceof CaptioningManager ? (CaptioningManager) systemService : null;
            if (captioningManager != null) {
                captioningManager.removeCaptioningChangeListener(captioningChangeListener);
            }
            this.captioningChangeListener = null;
        }
        this.decorView.setOnFocusChangeListener(null);
        iab.a(this.currentActivity, false, null);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent event) {
        if (this.useNativeControls && event != null) {
            this.touchEventCoalescingKeyHelper.a.put((int) event.getEventTime(), 0);
            EventDispatcher eventDispatcher = this.reactNativeEventDispatcher;
            if (eventDispatcher != null) {
                dy4.a(eventDispatcher, this, MotionEvent.obtainNoHistory(event), this.touchEventCoalescingKeyHelper);
            }
        }
        return false;
    }

    @Override // defpackage.mog
    public void onIsPlayingChanged(VideoPlayer videoPlayer, boolean z, Boolean bool) {
        videoPlayer.getClass();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        PlayerView playerView = this.playerView;
        VideoPlayer videoPlayer = this.videoPlayer;
        ojh.y(playerView, videoPlayer != null ? videoPlayer.g0 : true);
        Activity activity = this.currentActivity;
        Rect rectC = iab.c(this.playerView);
        activity.getClass();
        INSTANCE.getClass();
        if (activity.getPackageManager().hasSystemFeature("android.software.picture_in_picture")) {
            try {
                activity.setPictureInPictureParams(new PictureInPictureParams.Builder().setSourceRectHint(rectC).build());
                j6g j6gVar = j6g.a;
            } catch (IllegalStateException unused) {
                Log.e("ExpoVideo", "Current activity does not support picture-in-picture. Make sure you have configured the `expo-video` config plugin correctly.");
            }
        }
    }

    @Override // defpackage.mog
    public void onMutedChanged(VideoPlayer videoPlayer, boolean z, Boolean bool) {
        videoPlayer.getClass();
    }

    @Override // defpackage.mog
    public void onPlaybackRateChanged(VideoPlayer videoPlayer, float f, Float f2) {
        videoPlayer.getClass();
    }

    @Override // defpackage.mog
    public void onPlayedToEnd(VideoPlayer videoPlayer) {
        videoPlayer.getClass();
    }

    @Override // defpackage.mog
    public void onRenderedFirstFrame(VideoPlayer player) {
        player.getClass();
        this.shouldHideSurfaceView = false;
        applySurfaceViewVisibility();
        getOnFirstFrameRender().invoke(j6g.a);
    }

    @Override // defpackage.mog
    public void onSourceChanged(VideoPlayer videoPlayer, VideoSource videoSource, VideoSource videoSource2) {
        videoPlayer.getClass();
    }

    @Override // defpackage.mog
    public void onStatusChanged(VideoPlayer videoPlayer, PlayerStatus playerStatus, PlayerStatus playerStatus2, PlaybackError playbackError) {
        videoPlayer.getClass();
        playerStatus.getClass();
    }

    @Override // defpackage.mog
    public void onTimeUpdate(VideoPlayer videoPlayer, TimeUpdate timeUpdate) {
        videoPlayer.getClass();
        timeUpdate.getClass();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (!this.useNativeControls && event != null) {
            this.touchEventCoalescingKeyHelper.a.put((int) event.getEventTime(), 0);
            EventDispatcher eventDispatcher = this.reactNativeEventDispatcher;
            if (eventDispatcher != null) {
                dy4.a(eventDispatcher, this, event, this.touchEventCoalescingKeyHelper);
            }
        }
        if (event != null && event.getActionMasked() == 1) {
            performClick();
        }
        return true;
    }

    @Override // defpackage.mog
    public void onTrackSelectionParametersChanged(VideoPlayer videoPlayer, dqf dqfVar) {
        videoPlayer.getClass();
        dqfVar.getClass();
    }

    @Override // defpackage.mog
    public void onTracksChanged(VideoPlayer player, wqf tracks) {
        player.getClass();
        tracks.getClass();
        this.showsSubtitlesButton = !player.V.e.isEmpty();
        this.showsAudioTracksButton = player.W.e.size() > 1;
        this.playerView.setShowSubtitleButton(this.showsSubtitlesButton);
    }

    @Override // defpackage.mog
    public void onVideoSourceLoaded(VideoPlayer player, VideoSource videoSource, Double duration, List<VideoTrack> availableVideoTracks, List<SubtitleTrack> availableSubtitleTracks, List<AudioTrack> availableAudioTracks) {
        player.getClass();
        availableVideoTracks.getClass();
        availableSubtitleTracks.getClass();
        availableAudioTracks.getClass();
        VideoTrack videoTrack = (VideoTrack) z92.Q0(availableVideoTracks);
        if (videoTrack != null) {
            iab.a(this.currentActivity, getAutoEnterPiP(), iab.b(new tog(videoTrack.getSize().getWidth(), videoTrack.getSize().getHeight()), getWidth(), getHeight(), this.contentFit));
        }
        mog.a.a(player, availableVideoTracks, availableSubtitleTracks, availableAudioTracks);
    }

    @Override // defpackage.mog
    public void onVideoTrackChanged(VideoPlayer videoPlayer, VideoTrack videoTrack, VideoTrack videoTrack2) {
        videoPlayer.getClass();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View changedView, int visibility) {
        changedView.getClass();
        super.onVisibilityChanged(changedView, visibility);
        if (visibility == 0) {
            PlayerView playerView = this.playerView;
            Context context = getContext();
            context.getClass();
            iye.a(playerView, context);
        }
    }

    @Override // defpackage.mog
    public void onVolumeChanged(VideoPlayer videoPlayer, float f, Float f2) {
        videoPlayer.getClass();
    }

    @Override // defpackage.m45, android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        post(this.mLayoutRunnable);
    }

    public final void setAllowsFullscreen(boolean z) {
        PlayerView playerView = this.playerView;
        if (z) {
            playerView.setFullscreenButtonClickListener(new wk3(this, 9));
        } else {
            playerView.setFullscreenButtonClickListener(null);
            PlayerView playerView2 = this.playerView;
            playerView2.getClass();
            ImageButton imageButton = (ImageButton) playerView2.findViewById(com.indeed.android.jobsearch.R.id.exo_fullscreen);
            if (imageButton != null) {
                imageButton.setVisibility(8);
            }
        }
        this.allowsFullscreen = z;
    }

    public final void setAutoEnterPiP(boolean z) {
        this.autoEnterPiP.a($$delegatedProperties[5], Boolean.valueOf(z));
    }

    public final void setContentFit(ContentFit contentFit) {
        contentFit.getClass();
        this.playerView.setResizeMode(contentFit.toResizeMode());
        this.contentFit = contentFit;
    }

    public final void setFullscreenOptions(FullscreenOptions fullscreenOptions) {
        fullscreenOptions.getClass();
        this.fullscreenOptions = fullscreenOptions;
        boolean enable = fullscreenOptions.getEnable();
        PlayerView playerView = this.playerView;
        if (enable) {
            playerView.setFullscreenButtonClickListener(new uh9(this, 5));
            return;
        }
        playerView.setFullscreenButtonClickListener(null);
        PlayerView playerView2 = this.playerView;
        playerView2.getClass();
        ImageButton imageButton = (ImageButton) playerView2.findViewById(com.indeed.android.jobsearch.R.id.exo_fullscreen);
        if (imageButton != null) {
            imageButton.setVisibility(8);
        }
    }

    public final void setShouldHideSurfaceView(boolean z) {
        this.shouldHideSurfaceView = z;
    }

    public final void setUseExoShutter(Boolean bool) {
        boolean zB = wl7.b(bool, Boolean.TRUE);
        PlayerView playerView = this.playerView;
        if (zB) {
            playerView.setShutterBackgroundColor(-16777216);
        } else {
            playerView.setShutterBackgroundColor(0);
        }
        applySurfaceViewVisibility();
        this.useExoShutter = bool;
    }

    public final void setUseNativeControls(boolean z) {
        this.playerView.setUseController(z);
        this.playerView.setShowSubtitleButton(z);
        this.useNativeControls = z;
    }

    public final void setVideoPlayer(VideoPlayer videoPlayer) {
        ddb ddbVar;
        i45 i45Var;
        ddb ddbVar2;
        i45 i45Var2;
        List list;
        VideoPlayer videoPlayer2 = this.videoPlayer;
        if (videoPlayer2 != null) {
            yng.a.getClass();
            LinkedHashMap linkedHashMap = yng.e;
            List list2 = (List) linkedHashMap.get(videoPlayer2);
            if (list2 != null) {
                list2.remove(this);
            }
            if ((linkedHashMap.get(videoPlayer2) == null || ((list = (List) linkedHashMap.get(videoPlayer2)) != null && list.size() == 0)) && (ddbVar2 = videoPlayer2.Y.b) != null && (i45Var2 = ddbVar2.a) != null) {
                d dVar = videoPlayer2.X;
                dVar.getClass();
                u63.Y(i45Var2.k().g, null, null, new l45(i45Var2, dVar, null), 3);
            }
        }
        VideoPlayer videoPlayer3 = this.videoPlayer;
        if (videoPlayer3 != null) {
            w92.B0(videoPlayer3.d, new ma(this, 22));
        }
        if (videoPlayer != null) {
            videoPlayer.b0(this);
        }
        this.videoPlayer = videoPlayer;
        this.shouldHideSurfaceView = !(videoPlayer != null ? videoPlayer.a0 : false);
        applySurfaceViewVisibility();
        attachPlayer();
        if (videoPlayer != null) {
            yng.a.getClass();
            LinkedHashMap linkedHashMap2 = yng.e;
            List list3 = (List) linkedHashMap2.get(videoPlayer);
            if (list3 == null || !list3.contains(this)) {
                List list4 = (List) linkedHashMap2.get(videoPlayer);
                if (list4 != null) {
                    list4.add(this);
                } else {
                    linkedHashMap2.put(videoPlayer, u63.k(this));
                }
                List list5 = (List) linkedHashMap2.get(videoPlayer);
                if (list5 != null && list5.size() == 1 && (ddbVar = videoPlayer.Y.b) != null && (i45Var = ddbVar.a) != null) {
                    u63.Y(i45Var.k().g, null, null, new j45(videoPlayer, i45Var, null), 3);
                }
            }
        }
        if (wl7.b(videoPlayer3, videoPlayer) || videoPlayer3 == null) {
            return;
        }
        c00 c00Var = videoPlayer3.e;
        PlayerView playerView = (PlayerView) ((WeakReference) c00Var.a).get();
        if (wl7.b(playerView != null ? playerView.getPlayer() : null, videoPlayer3.X)) {
            r6.g("The player has been notified of disconnection from the player view, even though it's still connected.");
        } else {
            c00Var.a = new WeakReference(null);
        }
    }

    public final void setWasAutoPaused(boolean z) {
        this.wasAutoPaused = z;
    }

    public final void setWillEnterPiP(boolean z) {
        this.willEnterPiP = z;
    }

    public /* synthetic */ VideoView(Context context, gk0 gk0Var, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, gk0Var, (i & 4) != 0 ? false : z);
    }
}
