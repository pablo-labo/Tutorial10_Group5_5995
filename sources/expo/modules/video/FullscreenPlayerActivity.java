package expo.modules.video;

import android.app.Activity;
import android.app.PictureInPictureParams;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.Rational;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.CaptioningManager;
import android.widget.ImageButton;
import androidx.media3.exoplayer.d;
import androidx.media3.ui.PlayerView;
import com.indeed.android.jobsearch.R;
import defpackage.bu5;
import defpackage.cu5;
import defpackage.d2f;
import defpackage.dd;
import defpackage.gdb;
import defpackage.hye;
import defpackage.iab;
import defpackage.iye;
import defpackage.ojh;
import defpackage.qq;
import defpackage.tog;
import defpackage.wl7;
import defpackage.yk3;
import defpackage.yng;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.video.FullscreenPlayerActivity;
import expo.modules.video.VideoView;
import expo.modules.video.player.VideoPlayer;
import expo.modules.video.records.FullscreenOptions;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/video/FullscreenPlayerActivity;", "Landroid/app/Activity;", "<init>", "()V", "expo-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FullscreenPlayerActivity extends Activity {
    public static final /* synthetic */ int Z = 0;
    public boolean V;
    public FullscreenOptions W;
    public cu5 X;
    public hye Y;
    public View a;
    public String b;
    public VideoPlayer c;
    public PlayerView d;
    public VideoView e;
    public boolean f;

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        this.f = true;
        yng yngVar = yng.a;
        String str = this.b;
        if (str == null) {
            wl7.g("videoViewId");
            throw null;
        }
        yngVar.getClass();
        yng.c(str).attachPlayer();
        if (Build.VERSION.SDK_INT >= 34) {
            overrideActivityTransition(1, 0, 0);
        } else {
            overridePendingTransition(0, 0);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        cu5 cu5Var = this.X;
        if (cu5Var == null) {
            wl7.g("orientationHelper");
            throw null;
        }
        dd ddVar = cu5Var.c;
        int i = configuration.orientation;
        if (cu5Var.b.getAutoExitOnRotate()) {
            if (cu5Var.g && i == 2) {
                ddVar.invoke();
            } else if (cu5Var.f && i == 1) {
                ddVar.invoke();
            }
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        FullscreenOptions fullscreenOptions;
        super.onCreate(bundle);
        try {
            String stringExtra = getIntent().getStringExtra("player_uuid");
            if (stringExtra == null) {
                throw new FullScreenVideoViewNotFoundException();
            }
            this.b = stringExtra;
            if (Build.VERSION.SDK_INT >= 33) {
                fullscreenOptions = (FullscreenOptions) getIntent().getSerializableExtra("fullscreen_options", FullscreenOptions.class);
                if (fullscreenOptions == null) {
                    throw new FullScreenOptionsNotFoundException();
                }
            } else {
                Serializable serializableExtra = getIntent().getSerializableExtra("fullscreen_options");
                fullscreenOptions = serializableExtra instanceof FullscreenOptions ? (FullscreenOptions) serializableExtra : null;
                if (fullscreenOptions == null) {
                    throw new FullScreenOptionsNotFoundException();
                }
            }
            this.W = fullscreenOptions;
            yng yngVar = yng.a;
            String str = this.b;
            if (str == null) {
                wl7.g("videoViewId");
                throw null;
            }
            yngVar.getClass();
            this.e = yng.c(str);
            FullscreenOptions fullscreenOptions2 = this.W;
            if (fullscreenOptions2 == null) {
                wl7.g("options");
                throw null;
            }
            cu5 cu5Var = new cu5(this, fullscreenOptions2, new dd(this, 7), new qq(this, 11));
            this.X = cu5Var;
            d2f d2fVar = cu5Var.h;
            if (((bu5) d2fVar.getValue()).canDetectOrientation()) {
                ((bu5) d2fVar.getValue()).enable();
            }
            setContentView(R.layout.fullscreen_player_activity);
            this.a = findViewById(R.id.enclosing_layout);
            this.d = (PlayerView) findViewById(R.id.player_view);
            FullscreenOptions fullscreenOptions3 = this.W;
            if (fullscreenOptions3 == null) {
                wl7.g("options");
                throw null;
            }
            setRequestedOrientation(fullscreenOptions3.getOrientation().toActivityOrientation());
            VideoView videoView = this.e;
            if (videoView == null) {
                wl7.g("videoView");
                throw null;
            }
            VideoPlayer videoPlayer = videoView.getVideoPlayer();
            this.c = videoPlayer;
            if (videoPlayer != null) {
                PlayerView playerView = this.d;
                if (playerView == null) {
                    wl7.g("playerView");
                    throw null;
                }
                videoPlayer.d0(playerView);
            }
            String strValueOf = String.valueOf(hashCode());
            strValueOf.getClass();
            yng.d.put(strValueOf, new WeakReference(this));
            PlayerView playerView2 = this.d;
            if (playerView2 == null) {
                wl7.g("playerView");
                throw null;
            }
            gdb player = playerView2.getPlayer();
            if (player != null) {
                tog togVarD0 = player.d0();
                togVarD0.getClass();
                PlayerView playerView3 = this.d;
                if (playerView3 == null) {
                    wl7.g("playerView");
                    throw null;
                }
                int width = playerView3.getWidth();
                PlayerView playerView4 = this.d;
                if (playerView4 == null) {
                    wl7.g("playerView");
                    throw null;
                }
                int height = playerView4.getHeight();
                VideoView videoView2 = this.e;
                if (videoView2 == null) {
                    wl7.g("videoView");
                    throw null;
                }
                Rational rationalB = iab.b(togVarD0, width, height, videoView2.getContentFit());
                VideoView videoView3 = this.e;
                if (videoView3 != null) {
                    iab.a(this, videoView3.getAutoEnterPiP(), rationalB);
                } else {
                    wl7.g("videoView");
                    throw null;
                }
            }
        } catch (CodedException e) {
            Log.e("ExpoVideo", String.valueOf(e.getMessage()), e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        hye hyeVar = this.Y;
        if (hyeVar != null) {
            Object systemService = getSystemService("captioning");
            CaptioningManager captioningManager = systemService instanceof CaptioningManager ? (CaptioningManager) systemService : null;
            if (captioningManager != null) {
                captioningManager.removeCaptioningChangeListener(hyeVar);
            }
            this.Y = null;
        }
        VideoView videoView = this.e;
        if (videoView == null) {
            wl7.g("videoView");
            throw null;
        }
        videoView.exitFullscreen();
        yng yngVar = yng.a;
        String strValueOf = String.valueOf(hashCode());
        yngVar.getClass();
        strValueOf.getClass();
        yng.d.remove(strValueOf);
        cu5 cu5Var = this.X;
        if (cu5Var != null) {
            ((bu5) cu5Var.h.getValue()).disable();
        } else {
            wl7.g("orientationHelper");
            throw null;
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        d dVar;
        d dVar2;
        VideoPlayer videoPlayer = this.c;
        if ((videoPlayer == null || !videoPlayer.h0) && !this.f) {
            boolean z = (videoPlayer == null || (dVar2 = videoPlayer.X) == null || !dVar2.t0()) ? false : true;
            this.V = z;
            if (z) {
                PlayerView playerView = this.d;
                if (playerView == null) {
                    wl7.g("playerView");
                    throw null;
                }
                playerView.setUseController(false);
                VideoPlayer videoPlayer2 = this.c;
                if (videoPlayer2 != null && (dVar = videoPlayer2.X) != null) {
                    dVar.c();
                }
            }
        }
        cu5 cu5Var = this.X;
        if (cu5Var == null) {
            wl7.g("orientationHelper");
            throw null;
        }
        ((bu5) cu5Var.h.getValue()).disable();
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        VideoPlayer videoPlayer;
        d dVar;
        PlayerView playerView = this.d;
        if (z) {
            if (playerView == null) {
                wl7.g("playerView");
                throw null;
            }
            playerView.setUseController(false);
        } else {
            if (playerView == null) {
                wl7.g("playerView");
                throw null;
            }
            VideoView videoView = this.e;
            if (videoView == null) {
                wl7.g("videoView");
                throw null;
            }
            playerView.setUseController(videoView.getUseNativeControls());
        }
        if (this.V && z && (videoPlayer = this.c) != null && (dVar = videoPlayer.X) != null) {
            dVar.u0();
        }
        super.onPictureInPictureModeChanged(z, configuration);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        int i = Build.VERSION.SDK_INT;
        View view = this.a;
        int i2 = 2;
        if (i >= 30) {
            if (view == null) {
                wl7.g("mContentView");
                throw null;
            }
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                windowInsetsController.setSystemBarsBehavior(2);
                windowInsetsController.hide(WindowInsets.Type.statusBars() | WindowInsets.Type.navigationBars());
            }
        } else {
            if (view == null) {
                wl7.g("mContentView");
                throw null;
            }
            view.setSystemUiVisibility(4871);
        }
        PlayerView playerView = this.d;
        if (playerView == null) {
            wl7.g("playerView");
            throw null;
        }
        playerView.setFullscreenButtonClickListener(new yk3(this, i2));
        PlayerView playerView2 = this.d;
        if (playerView2 == null) {
            wl7.g("playerView");
            throw null;
        }
        View viewFindViewById = playerView2.findViewById(R.id.exo_fullscreen);
        viewFindViewById.getClass();
        ((ImageButton) viewFindViewById).setImageResource(2131231107);
        PlayerView playerView3 = this.d;
        if (playerView3 == null) {
            wl7.g("playerView");
            throw null;
        }
        VideoPlayer videoPlayer = this.c;
        ojh.f(playerView3, videoPlayer != null ? videoPlayer.g0 : false);
        PlayerView playerView4 = this.d;
        if (playerView4 == null) {
            wl7.g("playerView");
            throw null;
        }
        playerView4.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: du5
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                FullscreenPlayerActivity fullscreenPlayerActivity = this.a;
                PlayerView playerView5 = fullscreenPlayerActivity.d;
                if (playerView5 == null) {
                    wl7.g("playerView");
                    throw null;
                }
                VideoPlayer videoPlayer2 = fullscreenPlayerActivity.c;
                ojh.y(playerView5, videoPlayer2 != null ? videoPlayer2.g0 : true);
            }
        });
        PlayerView playerView5 = this.d;
        if (playerView5 == null) {
            wl7.g("playerView");
            throw null;
        }
        VideoView videoView = this.e;
        if (videoView == null) {
            wl7.g("videoView");
            throw null;
        }
        playerView5.setShowSubtitleButton(videoView.getShowsSubtitlesButton());
        PlayerView playerView6 = this.d;
        if (playerView6 == null) {
            wl7.g("playerView");
            throw null;
        }
        iye.a(playerView6, this);
        Object systemService = getSystemService("captioning");
        CaptioningManager captioningManager = systemService instanceof CaptioningManager ? (CaptioningManager) systemService : null;
        PlayerView playerView7 = this.d;
        if (playerView7 == null) {
            wl7.g("playerView");
            throw null;
        }
        hye hyeVar = new hye(playerView7, this);
        this.Y = hyeVar;
        if (captioningManager != null) {
            captioningManager.addCaptioningChangeListener(hyeVar);
        }
        PlayerView playerView8 = this.d;
        if (playerView8 != null) {
            playerView8.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: eu5
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                    FullscreenPlayerActivity fullscreenPlayerActivity = this.a;
                    PlayerView playerView9 = fullscreenPlayerActivity.d;
                    if (playerView9 == null) {
                        wl7.g("playerView");
                        throw null;
                    }
                    Rect rectC = iab.c(playerView9);
                    VideoView.INSTANCE.getClass();
                    if (fullscreenPlayerActivity.getPackageManager().hasSystemFeature("android.software.picture_in_picture")) {
                        try {
                            fullscreenPlayerActivity.setPictureInPictureParams(new PictureInPictureParams.Builder().setSourceRectHint(rectC).build());
                            j6g j6gVar = j6g.a;
                        } catch (IllegalStateException unused) {
                            Log.e("ExpoVideo", "Current activity does not support picture-in-picture. Make sure you have configured the `expo-video` config plugin correctly.");
                        }
                    }
                }
            });
        } else {
            wl7.g("playerView");
            throw null;
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        cu5 cu5Var = this.X;
        if (cu5Var == null) {
            wl7.g("orientationHelper");
            throw null;
        }
        d2f d2fVar = cu5Var.h;
        if (((bu5) d2fVar.getValue()).canDetectOrientation()) {
            ((bu5) d2fVar.getValue()).enable();
        }
        PlayerView playerView = this.d;
        if (playerView == null) {
            wl7.g("playerView");
            throw null;
        }
        playerView.setUseController(true);
        PlayerView playerView2 = this.d;
        if (playerView2 == null) {
            wl7.g("playerView");
            throw null;
        }
        iye.a(playerView2, this);
        super.onResume();
    }
}
