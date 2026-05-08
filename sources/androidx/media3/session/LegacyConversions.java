package androidx.media3.session;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.media3.common.PlaybackException;
import androidx.media3.session.legacy.MediaBrowserCompat;
import androidx.media3.session.legacy.MediaDescriptionCompat;
import androidx.media3.session.legacy.MediaMetadataCompat;
import androidx.media3.session.legacy.PlaybackStateCompat;
import androidx.media3.session.legacy.RatingCompat;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.datadog.android.rum.metric.interactiontonextview.TimeBasedInteractionIdentifier;
import com.indeed.android.jobsearch.R;
import defpackage.e47;
import defpackage.hz8;
import defpackage.i47;
import defpackage.ij9;
import defpackage.jre;
import defpackage.kh6;
import defpackage.kj9;
import defpackage.l5;
import defpackage.mlf;
import defpackage.oj9;
import defpackage.ox0;
import defpackage.p6;
import defpackage.qic;
import defpackage.qyc;
import defpackage.r6g;
import defpackage.ryc;
import defpackage.vjg;
import defpackage.z7b;
import defpackage.zkd;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class LegacyConversions {
    public static final i47<String> a;

    public static class ConversionException extends Exception {
    }

    static {
        int i = i47.c;
        Object[] objArr = new Object[32];
        objArr[0] = "android.media.metadata.TITLE";
        objArr[1] = "android.media.metadata.ARTIST";
        objArr[2] = "android.media.metadata.DURATION";
        objArr[3] = "android.media.metadata.ALBUM";
        objArr[4] = "android.media.metadata.AUTHOR";
        objArr[5] = "android.media.metadata.WRITER";
        System.arraycopy(new String[]{"android.media.metadata.COMPOSER", "android.media.metadata.COMPILATION", "android.media.metadata.DATE", "android.media.metadata.YEAR", "android.media.metadata.GENRE", "android.media.metadata.TRACK_NUMBER", "android.media.metadata.NUM_TRACKS", "android.media.metadata.DISC_NUMBER", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.ART", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART", "android.media.metadata.ALBUM_ART_URI", "android.media.metadata.USER_RATING", "android.media.metadata.RATING", "android.media.metadata.DISPLAY_TITLE", "android.media.metadata.DISPLAY_SUBTITLE", "android.media.metadata.DISPLAY_DESCRIPTION", "android.media.metadata.DISPLAY_ICON", "android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.MEDIA_ID", "android.media.metadata.MEDIA_URI", "android.media.metadata.BT_FOLDER_TYPE", "android.media.metadata.ADVERTISEMENT", "android.media.metadata.DOWNLOAD_STATUS", "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"}, 0, objArr, 6, 26);
        a = i47.j(32, objArr);
    }

    public static MediaBrowserCompat.MediaItem a(ij9 ij9Var, Bitmap bitmap) {
        MediaDescriptionCompat mediaDescriptionCompatI = i(ij9Var, bitmap);
        oj9 oj9Var = ij9Var.d;
        Boolean bool = oj9Var.q;
        int i = (bool == null || !bool.booleanValue()) ? 0 : 1;
        Boolean bool2 = oj9Var.r;
        if (bool2 != null && bool2.booleanValue()) {
            i |= 2;
        }
        return new MediaBrowserCompat.MediaItem(mediaDescriptionCompatI, i);
    }

    public static long b(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat, long j) {
        long j2 = playbackStateCompat == null ? 0L : playbackStateCompat.c;
        long jD = d(playbackStateCompat, mediaMetadataCompat, j);
        long jE = e(mediaMetadataCompat);
        return jE == -9223372036854775807L ? Math.max(jD, j2) : vjg.j(j2, jD, jE);
    }

    public static byte[] c(Bitmap bitmap) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long d(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat, long j) {
        if (playbackStateCompat == null) {
            return 0L;
        }
        long jMax = playbackStateCompat.b;
        if (playbackStateCompat.a == 3) {
            jMax = Math.max(0L, jMax + ((long) (playbackStateCompat.d * ((j == -9223372036854775807L ? null : Long.valueOf(j)) != null ? r4.longValue() : SystemClock.elapsedRealtime() - playbackStateCompat.W))));
        }
        long j2 = jMax;
        long jE = e(mediaMetadataCompat);
        return jE == -9223372036854775807L ? Math.max(0L, j2) : vjg.j(j2, 0L, jE);
    }

    public static long e(MediaMetadataCompat mediaMetadataCompat) {
        if (mediaMetadataCompat == null || !mediaMetadataCompat.a.containsKey("android.media.metadata.DURATION")) {
            return -9223372036854775807L;
        }
        long jA = mediaMetadataCompat.a("android.media.metadata.DURATION");
        if (jA <= 0) {
            return -9223372036854775807L;
        }
        return jA;
    }

    public static long f(int i) {
        switch (i) {
            case 0:
                return 0L;
            case 1:
                return 1L;
            case 2:
                return 2L;
            case 3:
                return 3L;
            case 4:
                return 4L;
            case 5:
                return 5L;
            case 6:
                return 6L;
            default:
                l5.q(p6.c(i, "Unrecognized FolderType: "));
                return 0L;
        }
    }

    public static int g(long j) {
        if (j == 0) {
            return 0;
        }
        if (j == 1) {
            return 1;
        }
        if (j == 2) {
            return 2;
        }
        if (j == 3) {
            return 3;
        }
        if (j == 4) {
            return 4;
        }
        if (j == 5) {
            return 5;
        }
        return j == 6 ? 6 : 0;
    }

    public static kj9 h(Context context, Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        try {
            bundle.setClassLoader(context.getClassLoader());
            int i = bundle.getInt("androidx.media.MediaBrowserCompat.Extras.KEY_ROOT_CHILDREN_SUPPORTED_FLAGS", -1);
            if (i >= 0) {
                bundle.remove("androidx.media.MediaBrowserCompat.Extras.KEY_ROOT_CHILDREN_SUPPORTED_FLAGS");
                boolean z = true;
                if (i != 1) {
                    z = false;
                }
                bundle.putBoolean("androidx.media3.session.LibraryParams.Extras.KEY_ROOT_CHILDREN_BROWSABLE_ONLY", z);
            }
            Bundle bundle2 = Bundle.EMPTY;
            return new kj9(bundle, bundle.getBoolean("android.service.media.extra.RECENT"), bundle.getBoolean("android.service.media.extra.OFFLINE"), bundle.getBoolean("android.service.media.extra.SUGGESTED"));
        } catch (Exception unused) {
            Bundle bundle3 = Bundle.EMPTY;
            return new kj9(bundle, false, false, false);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.media3.session.legacy.MediaDescriptionCompat i(defpackage.ij9 r16, android.graphics.Bitmap r17) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.session.LegacyConversions.i(ij9, android.graphics.Bitmap):androidx.media3.session.legacy.MediaDescriptionCompat");
    }

    public static ij9 j(MediaDescriptionCompat mediaDescriptionCompat) {
        mediaDescriptionCompat.getClass();
        String str = mediaDescriptionCompat.a;
        ij9.b.a aVar = new ij9.b.a();
        ryc rycVar = ryc.V;
        e47.b bVar = e47.b;
        qyc qycVar = qyc.e;
        List list = Collections.EMPTY_LIST;
        ij9.e.a aVar2 = new ij9.e.a();
        ij9.g gVar = ij9.g.d;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        ij9.g.a aVar3 = new ij9.g.a();
        aVar3.a = mediaDescriptionCompat.W;
        ij9.g gVar2 = new ij9.g(aVar3);
        oj9 oj9VarL = l(mediaDescriptionCompat, 0);
        ij9.c cVar = new ij9.c(aVar);
        ij9.e eVar = new ij9.e(aVar2);
        if (oj9VarL == null) {
            oj9VarL = oj9.K;
        }
        return new ij9(str2, cVar, null, eVar, oj9VarL, gVar2);
    }

    public static ij9 k(String str, MediaMetadataCompat mediaMetadataCompat, int i) {
        ij9.g gVar;
        ij9.b.a aVar = new ij9.b.a();
        ryc rycVar = ryc.V;
        e47.b bVar = e47.b;
        qyc qycVar = qyc.e;
        List list = Collections.EMPTY_LIST;
        qyc qycVar2 = qyc.e;
        ij9.e.a aVar2 = new ij9.e.a();
        ij9.g gVar2 = ij9.g.d;
        if (str == null) {
            str = null;
        }
        CharSequence charSequence = mediaMetadataCompat.a.getCharSequence("android.media.metadata.MEDIA_URI");
        String string = charSequence != null ? charSequence.toString() : null;
        if (string != null) {
            ij9.g.a aVar3 = new ij9.g.a();
            aVar3.a = Uri.parse(string);
            gVar = new ij9.g(aVar3);
        } else {
            gVar = gVar2;
        }
        oj9 oj9VarM = m(mediaMetadataCompat, i);
        if (str == null) {
            str = "";
        }
        String str2 = str;
        ij9.c cVar = new ij9.c(aVar);
        ij9.e eVar = new ij9.e(aVar2);
        if (oj9VarM == null) {
            oj9VarM = oj9.K;
        }
        return new ij9(str2, cVar, null, eVar, oj9VarM, gVar);
    }

    public static oj9 l(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        RatingCompat ratingCompat;
        byte[] bArrC;
        if (mediaDescriptionCompat == null) {
            return oj9.K;
        }
        CharSequence charSequence = mediaDescriptionCompat.b;
        oj9.a aVar = new oj9.a();
        aVar.f = mediaDescriptionCompat.c;
        aVar.g = mediaDescriptionCompat.d;
        aVar.m = mediaDescriptionCompat.f;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                ratingCompat = new RatingCompat(-1.0f, i);
                break;
            default:
                ratingCompat = null;
                break;
        }
        aVar.i = q(ratingCompat);
        Bitmap bitmap = mediaDescriptionCompat.e;
        if (bitmap != null) {
            try {
                bArrC = c(bitmap);
            } catch (IOException e) {
                zkd.U("LegacyConversions", "Failed to convert iconBitmap to artworkData", e);
                bArrC = null;
            }
            aVar.b(bArrC, 3);
        }
        Bundle bundle = mediaDescriptionCompat.V;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : null;
        if (bundle2 != null && bundle2.containsKey("android.media.extra.BT_FOLDER_TYPE")) {
            aVar.p = Integer.valueOf(g(bundle2.getLong("android.media.extra.BT_FOLDER_TYPE")));
            bundle2.remove("android.media.extra.BT_FOLDER_TYPE");
        }
        aVar.q = Boolean.FALSE;
        if (bundle2 != null && bundle2.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            aVar.G = Integer.valueOf((int) bundle2.getLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
            bundle2.remove("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle2 != null && bundle2.containsKey("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST")) {
            ArrayList<String> stringArrayList = bundle2.getStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST");
            stringArrayList.getClass();
            aVar.I = e47.j(e47.j(stringArrayList));
        }
        if (bundle2 == null || !bundle2.containsKey("androidx.media3.mediadescriptioncompat.title")) {
            aVar.a = charSequence;
        } else {
            aVar.a = bundle2.getCharSequence("androidx.media3.mediadescriptioncompat.title");
            aVar.e = charSequence;
            bundle2.remove("androidx.media3.mediadescriptioncompat.title");
        }
        if (bundle2 != null && !bundle2.isEmpty()) {
            aVar.H = bundle2;
        }
        aVar.r = Boolean.TRUE;
        return new oj9(aVar);
    }

    public static oj9 m(MediaMetadataCompat mediaMetadataCompat, int i) {
        CharSequence charSequence;
        CharSequence charSequence2;
        RatingCompat ratingCompatA;
        RatingCompat ratingCompatA2;
        RatingCompat ratingCompat;
        String string;
        if (mediaMetadataCompat == null) {
            return oj9.K;
        }
        Bundle bundle = mediaMetadataCompat.a;
        oj9.a aVar = new oj9.a();
        CharSequence charSequence3 = bundle.getCharSequence("android.media.metadata.DISPLAY_TITLE");
        int i2 = 0;
        if (charSequence3 != null) {
            charSequence2 = bundle.getCharSequence("android.media.metadata.DISPLAY_SUBTITLE");
            charSequence = bundle.getCharSequence("android.media.metadata.DISPLAY_DESCRIPTION");
        } else {
            CharSequence[] charSequenceArr = new CharSequence[3];
            int i3 = 0;
            int i4 = 0;
            while (i3 < 3) {
                String[] strArr = MediaMetadataCompat.d;
                if (i4 >= strArr.length) {
                    break;
                }
                int i5 = i4 + 1;
                CharSequence charSequence4 = bundle.getCharSequence(strArr[i4]);
                if (!TextUtils.isEmpty(charSequence4)) {
                    charSequenceArr[i3] = charSequence4;
                    i3++;
                }
                i4 = i5;
            }
            CharSequence charSequence5 = charSequenceArr[0];
            CharSequence charSequence6 = charSequenceArr[1];
            charSequence = charSequenceArr[2];
            charSequence3 = charSequence5;
            charSequence2 = charSequence6;
        }
        CharSequence charSequence7 = bundle.getCharSequence("android.media.metadata.TITLE");
        if (charSequence7 == null) {
            charSequence7 = charSequence3;
        }
        aVar.a = charSequence7;
        aVar.e = charSequence3;
        aVar.f = charSequence2;
        aVar.g = charSequence;
        aVar.b = bundle.getCharSequence("android.media.metadata.ARTIST");
        aVar.c = bundle.getCharSequence("android.media.metadata.ALBUM");
        aVar.d = bundle.getCharSequence("android.media.metadata.ALBUM_ARTIST");
        Bitmap bitmap = null;
        try {
            ratingCompatA = RatingCompat.a(bundle.getParcelable("android.media.metadata.RATING"));
        } catch (Exception e) {
            Log.w("MediaMetadata", "Failed to retrieve a key as Rating.", e);
            ratingCompatA = null;
        }
        aVar.j = q(ratingCompatA);
        if (bundle.containsKey("android.media.metadata.DURATION")) {
            long jA = mediaMetadataCompat.a("android.media.metadata.DURATION");
            if (jA >= 0) {
                aVar.c(Long.valueOf(jA));
            }
        }
        try {
            ratingCompatA2 = RatingCompat.a(bundle.getParcelable("android.media.metadata.USER_RATING"));
        } catch (Exception e2) {
            Log.w("MediaMetadata", "Failed to retrieve a key as Rating.", e2);
            ratingCompatA2 = null;
        }
        qic qicVarQ = q(ratingCompatA2);
        if (qicVarQ != null) {
            aVar.i = qicVarQ;
        } else {
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    ratingCompat = new RatingCompat(-1.0f, i);
                    break;
                default:
                    ratingCompat = null;
                    break;
            }
            aVar.i = q(ratingCompat);
        }
        if (bundle.containsKey("android.media.metadata.YEAR")) {
            aVar.s = Integer.valueOf((int) mediaMetadataCompat.a("android.media.metadata.YEAR"));
        }
        String[] strArr2 = {"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ALBUM_ART_URI", "android.media.metadata.ART_URI"};
        int i6 = 0;
        while (true) {
            if (i6 < 3) {
                String str = strArr2[i6];
                if (bundle.containsKey(str)) {
                    CharSequence charSequence8 = bundle.getCharSequence(str);
                    if (charSequence8 != null) {
                        string = charSequence8.toString();
                    }
                } else {
                    i6++;
                }
            }
        }
        string = null;
        if (string != null) {
            aVar.m = Uri.parse(string);
        }
        String[] strArr3 = {"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ALBUM_ART", "android.media.metadata.ART"};
        while (true) {
            if (i2 < 3) {
                String str2 = strArr3[i2];
                if (bundle.containsKey(str2)) {
                    try {
                        bitmap = (Bitmap) bundle.getParcelable(str2);
                    } catch (Exception e3) {
                        Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", e3);
                    }
                } else {
                    i2++;
                }
            }
        }
        if (bitmap != null) {
            try {
                aVar.b(c(bitmap), 3);
            } catch (IOException e4) {
                zkd.U("LegacyConversions", "Failed to convert artworkBitmap to artworkData", e4);
            }
        }
        boolean zContainsKey = bundle.containsKey("android.media.metadata.BT_FOLDER_TYPE");
        aVar.q = Boolean.valueOf(zContainsKey);
        if (zContainsKey) {
            aVar.p = Integer.valueOf(g(mediaMetadataCompat.a("android.media.metadata.BT_FOLDER_TYPE")));
        }
        if (bundle.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            aVar.G = Integer.valueOf((int) mediaMetadataCompat.a("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
        }
        aVar.r = Boolean.TRUE;
        Bundle bundle2 = new Bundle(bundle);
        r6g<String> it = a.iterator();
        while (it.hasNext()) {
            bundle2.remove(it.next());
        }
        if (!bundle2.isEmpty()) {
            aVar.H = bundle2;
        }
        return new oj9(aVar);
    }

    public static MediaMetadataCompat n(oj9 oj9Var, String str, Uri uri, long j, Bitmap bitmap) {
        Long l;
        MediaMetadataCompat.b bVar = new MediaMetadataCompat.b();
        bVar.d("android.media.metadata.MEDIA_ID", str);
        CharSequence charSequence = oj9Var.a;
        Bundle bundle = oj9Var.I;
        Integer num = oj9Var.p;
        Uri uri2 = oj9Var.m;
        if (charSequence != null) {
            bVar.e(charSequence, "android.media.metadata.TITLE");
        }
        CharSequence charSequence2 = oj9Var.e;
        if (charSequence2 != null) {
            bVar.e(charSequence2, "android.media.metadata.DISPLAY_TITLE");
        }
        CharSequence charSequence3 = oj9Var.f;
        if (charSequence3 != null) {
            bVar.e(charSequence3, "android.media.metadata.DISPLAY_SUBTITLE");
        }
        CharSequence charSequence4 = oj9Var.g;
        if (charSequence4 != null) {
            bVar.e(charSequence4, "android.media.metadata.DISPLAY_DESCRIPTION");
        }
        CharSequence charSequence5 = oj9Var.b;
        if (charSequence5 != null) {
            bVar.e(charSequence5, "android.media.metadata.ARTIST");
        }
        CharSequence charSequence6 = oj9Var.c;
        if (charSequence6 != null) {
            bVar.e(charSequence6, "android.media.metadata.ALBUM");
        }
        CharSequence charSequence7 = oj9Var.d;
        if (charSequence7 != null) {
            bVar.e(charSequence7, "android.media.metadata.ALBUM_ARTIST");
        }
        if (oj9Var.t != null) {
            bVar.b("android.media.metadata.YEAR", r7.intValue());
        }
        if (uri != null) {
            bVar.d("android.media.metadata.MEDIA_URI", uri.toString());
        }
        if (uri2 != null) {
            bVar.d("android.media.metadata.DISPLAY_ICON_URI", uri2.toString());
            bVar.d("android.media.metadata.ALBUM_ART_URI", uri2.toString());
            bVar.d("android.media.metadata.ART_URI", uri2.toString());
        }
        if (bitmap != null) {
            bVar.a(bitmap, "android.media.metadata.DISPLAY_ICON");
            bVar.a(bitmap, "android.media.metadata.ALBUM_ART");
        }
        if (num != null && num.intValue() != -1) {
            bVar.b("android.media.metadata.BT_FOLDER_TYPE", f(num.intValue()));
        }
        if (j == -9223372036854775807L && (l = oj9Var.h) != null) {
            j = l.longValue();
        }
        if (j == -9223372036854775807L) {
            j = -1;
        }
        bVar.b("android.media.metadata.DURATION", j);
        RatingCompat ratingCompatR = r(oj9Var.i);
        if (ratingCompatR != null) {
            bVar.c("android.media.metadata.USER_RATING", ratingCompatR);
        }
        RatingCompat ratingCompatR2 = r(oj9Var.j);
        if (ratingCompatR2 != null) {
            bVar.c("android.media.metadata.RATING", ratingCompatR2);
        }
        if (oj9Var.H != null) {
            bVar.b("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT", r6.intValue());
        }
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj == null || (obj instanceof CharSequence)) {
                    bVar.e((CharSequence) obj, str2);
                } else if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
                    bVar.b(str2, ((Number) obj).longValue());
                }
            }
        }
        return new MediaMetadataCompat(bVar.a);
    }

    public static PlaybackException o(PlaybackStateCompat playbackStateCompat, v vVar) {
        if (playbackStateCompat != null) {
            int i = playbackStateCompat.f;
            if (playbackStateCompat.a == 7) {
                CharSequence charSequenceY = playbackStateCompat.V;
                if (charSequenceY == null) {
                    charSequenceY = y(vVar, t(i));
                }
                Bundle bundle = playbackStateCompat.Z;
                String string = charSequenceY != null ? charSequenceY.toString() : null;
                int iT = t(i);
                if (iT == -5) {
                    iT = 2000;
                } else if (iT == -1) {
                    iT = 1000;
                }
                int i2 = iT;
                if (bundle == null) {
                    bundle = Bundle.EMPTY;
                }
                return new PlaybackException(string, null, i2, bundle, SystemClock.elapsedRealtime());
            }
        }
        return null;
    }

    public static int p(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                zkd.T("LegacyConversions", "Unrecognized RepeatMode: " + i + " was converted to `PlaybackStateCompat.REPEAT_MODE_NONE`");
                return 0;
            }
        }
        return i2;
    }

    public static qic q(RatingCompat ratingCompat) {
        if (ratingCompat == null) {
            return null;
        }
        float f = ratingCompat.b;
        int i = ratingCompat.a;
        switch (i) {
            case 1:
                if (ratingCompat.c()) {
                    return new kh6(i == 1 && f == 1.0f);
                }
                return new kh6();
            case 2:
                if (ratingCompat.c()) {
                    return new mlf(i == 2 && f == 1.0f);
                }
                return new mlf();
            case 3:
                return ratingCompat.c() ? new jre(ratingCompat.b(), 3) : new jre(3);
            case 4:
                return ratingCompat.c() ? new jre(ratingCompat.b(), 4) : new jre(4);
            case 5:
                return ratingCompat.c() ? new jre(ratingCompat.b(), 5) : new jre(5);
            case 6:
                if (!ratingCompat.c()) {
                    return new z7b();
                }
                if (i != 6 || !ratingCompat.c()) {
                    f = -1.0f;
                }
                return new z7b(f);
            default:
                return null;
        }
    }

    @SuppressLint({"WrongConstant"})
    public static RatingCompat r(qic qicVar) {
        if (qicVar != null) {
            int iX = x(qicVar);
            if (!qicVar.b()) {
                switch (iX) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return new RatingCompat(-1.0f, iX);
                    default:
                        return null;
                }
            }
            switch (iX) {
                case 1:
                    return new RatingCompat(((kh6) qicVar).c ? 1.0f : 0.0f, 1);
                case 2:
                    return new RatingCompat(((mlf) qicVar).c ? 1.0f : 0.0f, 2);
                case 3:
                case 4:
                case 5:
                    return RatingCompat.e(((jre) qicVar).c, iX);
                case 6:
                    return RatingCompat.d(((z7b) qicVar).b);
            }
        }
        return null;
    }

    public static int s(int i) {
        if (i == -1 || i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 3) {
                zkd.T("LegacyConversions", "Unrecognized PlaybackStateCompat.RepeatMode: " + i + " was converted to `Player.REPEAT_MODE_OFF`");
                return 0;
            }
        }
        return i2;
    }

    public static int t(int i) {
        switch (i) {
            case 1:
                return -2;
            case 2:
                return -6;
            case 3:
                return -102;
            case 4:
                return -103;
            case 5:
                return -104;
            case 6:
                return -105;
            case 7:
                return -106;
            case 8:
                return -110;
            case DatadogLogGenerator.CRASH /* 9 */:
                return -107;
            case 10:
                return 1;
            case 11:
                return -109;
            default:
                return -1;
        }
    }

    public static boolean u(int i) {
        if (i == -1 || i == 0) {
            return false;
        }
        if (i == 1 || i == 2) {
            return true;
        }
        l5.q(p6.c(i, "Unrecognized ShuffleMode: "));
        return false;
    }

    public static void v(hz8 hz8Var) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        long j = 3000;
        while (true) {
            try {
                try {
                    hz8Var.get(j, TimeUnit.MILLISECONDS);
                    if (z) {
                        return;
                    } else {
                        return;
                    }
                } catch (InterruptedException unused) {
                    z = true;
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    if (jElapsedRealtime2 >= TimeBasedInteractionIdentifier.DEFAULT_TIME_THRESHOLD_MS) {
                        throw new TimeoutException();
                    }
                    j = TimeBasedInteractionIdentifier.DEFAULT_TIME_THRESHOLD_MS - jElapsedRealtime2;
                }
            } finally {
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public static int w(ox0 ox0Var) {
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setContentType(ox0Var.a);
        builder.setFlags(ox0Var.b);
        builder.setUsage(ox0Var.c);
        AudioAttributes audioAttributesBuild = builder.build();
        audioAttributesBuild.getClass();
        int flags = audioAttributesBuild.getFlags();
        audioAttributesBuild.getClass();
        int usage = audioAttributesBuild.getUsage();
        if ((flags & 1) == 1) {
            return 7;
        }
        if ((flags & 4) == 4) {
            return 6;
        }
        switch (usage) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case DatadogLogGenerator.CRASH /* 9 */:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 12:
            default:
                return 3;
            case 13:
                return 1;
        }
    }

    public static int x(qic qicVar) {
        if (qicVar instanceof kh6) {
            return 1;
        }
        if (qicVar instanceof mlf) {
            return 2;
        }
        if (!(qicVar instanceof jre)) {
            return qicVar instanceof z7b ? 6 : 0;
        }
        int i = ((jre) qicVar).b;
        int i2 = 3;
        if (i != 3) {
            i2 = 4;
            if (i != 4) {
                i2 = 5;
                if (i != 5) {
                    return 0;
                }
            }
        }
        return i2;
    }

    public static String y(Context context, int i) {
        if (i == -100) {
            return context.getString(R.string.error_message_disconnected);
        }
        if (i == 1) {
            return context.getString(R.string.error_message_info_cancelled);
        }
        if (i == -6) {
            return context.getString(R.string.error_message_not_supported);
        }
        if (i == -5) {
            return context.getString(R.string.error_message_io);
        }
        if (i == -4) {
            return context.getString(R.string.error_message_permission_denied);
        }
        if (i == -3) {
            return context.getString(R.string.error_message_bad_value);
        }
        if (i == -2) {
            return context.getString(R.string.error_message_invalid_state);
        }
        switch (i) {
            case -110:
                return context.getString(R.string.error_message_content_already_playing);
            case -109:
                return context.getString(R.string.error_message_end_of_playlist);
            case -108:
                return context.getString(R.string.error_message_setup_required);
            case -107:
                return context.getString(R.string.error_message_skip_limit_reached);
            case -106:
                return context.getString(R.string.error_message_not_available_in_region);
            case -105:
                return context.getString(R.string.error_message_parental_control_restricted);
            case -104:
                return context.getString(R.string.error_message_concurrent_stream_limit);
            case -103:
                return context.getString(R.string.error_message_premium_account_required);
            case -102:
                return context.getString(R.string.error_message_authentication_expired);
            default:
                return context.getString(R.string.error_message_fallback);
        }
    }

    public static boolean z(long j, long j2) {
        return (j & j2) != 0;
    }
}
