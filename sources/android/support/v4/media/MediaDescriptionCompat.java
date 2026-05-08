package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

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
            Bundle bundle;
            Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
            if (objCreateFromParcel == null) {
                return null;
            }
            MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
            String strG = b.g(mediaDescription);
            CharSequence charSequenceI = b.i(mediaDescription);
            CharSequence charSequenceH = b.h(mediaDescription);
            CharSequence charSequenceC = b.c(mediaDescription);
            Bitmap bitmapE = b.e(mediaDescription);
            Uri uriF = b.f(mediaDescription);
            Bundle bundleD = b.d(mediaDescription);
            if (bundleD != null) {
                bundleD = MediaSessionCompat.a(bundleD);
            }
            Uri uriA = bundleD != null ? (Uri) bundleD.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
            if (uriA == null) {
                bundle = bundleD;
            } else if (bundleD.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && bundleD.size() == 2) {
                bundle = null;
            } else {
                bundleD.remove("android.support.v4.media.description.MEDIA_URI");
                bundleD.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                bundle = bundleD;
            }
            if (uriA == null) {
                uriA = c.a(mediaDescription);
            }
            MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(strG, charSequenceI, charSequenceH, charSequenceC, bitmapE, uriF, bundle, uriA);
            mediaDescriptionCompat.X = mediaDescription;
            return mediaDescriptionCompat;
        }

        @Override // android.os.Parcelable.Creator
        public final MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    public static class b {
        public static MediaDescription a(MediaDescription.Builder builder) {
            return builder.build();
        }

        public static MediaDescription.Builder b() {
            return new MediaDescription.Builder();
        }

        public static CharSequence c(MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }

        public static Bundle d(MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }

        public static Bitmap e(MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }

        public static Uri f(MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }

        public static String g(MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }

        public static CharSequence h(MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }

        public static CharSequence i(MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }

        public static void j(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        public static void k(MediaDescription.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        public static void l(MediaDescription.Builder builder, Bitmap bitmap) {
            builder.setIconBitmap(bitmap);
        }

        public static void m(MediaDescription.Builder builder, Uri uri) {
            builder.setIconUri(uri);
        }

        public static void n(MediaDescription.Builder builder, String str) {
            builder.setMediaId(str);
        }

        public static void o(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        public static void p(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    public static class c {
        public static Uri a(MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }

        public static void b(MediaDescription.Builder builder, Uri uri) {
            builder.setMediaUri(uri);
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

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.b) + ", " + ((Object) this.c) + ", " + ((Object) this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MediaDescription mediaDescriptionA = this.X;
        if (mediaDescriptionA == null) {
            MediaDescription.Builder builderB = b.b();
            b.n(builderB, this.a);
            b.p(builderB, this.b);
            b.o(builderB, this.c);
            b.j(builderB, this.d);
            b.l(builderB, this.e);
            b.m(builderB, this.f);
            b.k(builderB, this.V);
            c.b(builderB, this.W);
            mediaDescriptionA = b.a(builderB);
            this.X = mediaDescriptionA;
        }
        mediaDescriptionA.writeToParcel(parcel, i);
    }
}
