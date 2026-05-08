package defpackage;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import defpackage.fx9;
import defpackage.llf;
import java.io.InputStream;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes.dex */
public final class um9 implements fx9<Uri, InputStream> {
    public final Context a;

    public static class a implements gx9<Uri, InputStream> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // defpackage.gx9
        public final fx9<Uri, InputStream> c(n1a n1aVar) {
            return new um9(this.a);
        }
    }

    public um9(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.fx9
    public final fx9.a<InputStream> a(Uri uri, int i, int i2, ova ovaVar) {
        Long l;
        Uri uri2 = uri;
        if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384 || (l = (Long) ovaVar.c(VideoDecoder.d)) == null || l.longValue() != -1) {
            return null;
        }
        nna nnaVar = new nna(uri2);
        Context context = this.a;
        return new fx9.a<>(nnaVar, llf.c(context, uri2, new llf.b(context.getContentResolver())));
    }

    @Override // defpackage.fx9
    public final boolean b(Uri uri) {
        Uri uri2 = uri;
        return web.p(uri2) && uri2.getPathSegments().contains(MediaStreamTrack.VIDEO_TRACK_KIND);
    }
}
