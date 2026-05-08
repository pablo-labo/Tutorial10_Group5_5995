package androidx.media3.session.legacy;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();
    public final Bundle V;
    public final Uri W;
    public MediaDescription X;
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final Bitmap e;
    public final Uri f;

    public class a implements Parcelable.Creator<MediaDescriptionCompat> {
        @Override // android.os.Parcelable.Creator
        public final MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.a((MediaDescription) MediaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = charSequence3;
        this.e = bitmap;
        this.f = uri;
        this.V = bundle;
        this.W = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.media3.session.legacy.MediaDescriptionCompat a(android.media.MediaDescription r13) {
        /*
            java.lang.String r1 = r13.getMediaId()
            java.lang.CharSequence r2 = r13.getTitle()
            java.lang.CharSequence r3 = r13.getSubtitle()
            java.lang.CharSequence r4 = r13.getDescription()
            android.graphics.Bitmap r5 = r13.getIconBitmap()
            android.net.Uri r6 = r13.getIconUri()
            android.os.Bundle r0 = r13.getExtras()
            android.os.Bundle r0 = androidx.media3.session.legacy.MediaSessionCompat.c(r0)
            if (r0 == 0) goto L28
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>(r0)
            r0 = r7
        L28:
            r7 = 0
            if (r0 == 0) goto L4d
            java.lang.String r8 = "android.support.v4.media.description.MEDIA_URI"
            android.os.Parcelable r9 = r0.getParcelable(r8)
            android.net.Uri r9 = (android.net.Uri) r9
            if (r9 == 0) goto L4b
            java.lang.String r10 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r11 = r0.containsKey(r10)
            if (r11 == 0) goto L45
            int r11 = r0.size()
            r12 = 2
            if (r11 != r12) goto L45
            goto L4f
        L45:
            r0.remove(r8)
            r0.remove(r10)
        L4b:
            r7 = r0
            goto L4f
        L4d:
            r9 = r7
            goto L4b
        L4f:
            if (r9 == 0) goto L53
        L51:
            r8 = r9
            goto L58
        L53:
            android.net.Uri r9 = r13.getMediaUri()
            goto L51
        L58:
            androidx.media3.session.legacy.MediaDescriptionCompat r0 = new androidx.media3.session.legacy.MediaDescriptionCompat
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0.X = r13
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.session.legacy.MediaDescriptionCompat.a(android.media.MediaDescription):androidx.media3.session.legacy.MediaDescriptionCompat");
    }

    public final MediaDescription b() {
        MediaDescription mediaDescription = this.X;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.a);
        builder.setTitle(this.b);
        builder.setSubtitle(this.c);
        builder.setDescription(this.d);
        builder.setIconBitmap(this.e);
        builder.setIconUri(this.f);
        builder.setExtras(this.V);
        builder.setMediaUri(this.W);
        MediaDescription mediaDescriptionBuild = builder.build();
        this.X = mediaDescriptionBuild;
        return mediaDescriptionBuild;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.b) + ", " + ((Object) this.c) + ", " + ((Object) this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        b().writeToParcel(parcel, i);
    }
}
