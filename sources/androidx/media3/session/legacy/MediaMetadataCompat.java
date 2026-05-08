package androidx.media3.session.legacy;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.Rating;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ht0;
import defpackage.l5;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;
    public static final ht0<String, Integer> c;
    public static final String[] d;
    public final Bundle a;
    public MediaMetadata b;

    public class a implements Parcelable.Creator<MediaMetadataCompat> {
        @Override // android.os.Parcelable.Creator
        public final MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }
    }

    public static final class b {
        public final Bundle a = new Bundle();

        public final void a(Bitmap bitmap, String str) {
            Integer num = MediaMetadataCompat.c.get(str);
            if (num == null || num.intValue() == 2) {
                this.a.putParcelable(str, bitmap);
            } else {
                l5.q(l5.m("The ", str, " key cannot be used to put a Bitmap"));
            }
        }

        public final void b(String str, long j) {
            Integer num = MediaMetadataCompat.c.get(str);
            if (num == null || num.intValue() == 0) {
                this.a.putLong(str, j);
            } else {
                l5.q(l5.m("The ", str, " key cannot be used to put a long"));
            }
        }

        public final void c(String str, RatingCompat ratingCompat) {
            Object obj;
            float f = ratingCompat.b;
            Integer num = MediaMetadataCompat.c.get(str);
            if (num != null && num.intValue() != 3) {
                l5.q(l5.m("The ", str, " key cannot be used to put a Rating"));
                return;
            }
            if (ratingCompat.c == null) {
                boolean zC = ratingCompat.c();
                int i = ratingCompat.a;
                if (zC) {
                    switch (i) {
                        case 1:
                            ratingCompat.c = Rating.newHeartRating(i == 1 && f == 1.0f);
                            break;
                        case 2:
                            ratingCompat.c = Rating.newThumbRating(i == 2 && f == 1.0f);
                            break;
                        case 3:
                        case 4:
                        case 5:
                            ratingCompat.c = Rating.newStarRating(i, ratingCompat.b());
                            break;
                        case 6:
                            if (i != 6 || !ratingCompat.c()) {
                                f = -1.0f;
                            }
                            ratingCompat.c = Rating.newPercentageRating(f);
                            break;
                        default:
                            obj = null;
                            break;
                    }
                } else {
                    ratingCompat.c = Rating.newUnratedRating(i);
                }
                obj = ratingCompat.c;
            } else {
                obj = ratingCompat.c;
            }
            this.a.putParcelable(str, (Parcelable) obj);
        }

        public final void d(String str, String str2) {
            Integer num = MediaMetadataCompat.c.get(str);
            if (num == null || num.intValue() == 1) {
                this.a.putCharSequence(str, str2);
            } else {
                l5.q(l5.m("The ", str, " key cannot be used to put a String"));
            }
        }

        public final void e(CharSequence charSequence, String str) {
            Integer num = MediaMetadataCompat.c.get(str);
            if (num == null || num.intValue() == 1) {
                this.a.putCharSequence(str, charSequence);
            } else {
                l5.q(l5.m("The ", str, " key cannot be used to put a CharSequence"));
            }
        }
    }

    static {
        ht0<String, Integer> ht0Var = new ht0<>();
        c = ht0Var;
        ht0Var.put("android.media.metadata.TITLE", 1);
        ht0Var.put("android.media.metadata.ARTIST", 1);
        ht0Var.put("android.media.metadata.DURATION", 0);
        ht0Var.put("android.media.metadata.ALBUM", 1);
        ht0Var.put("android.media.metadata.AUTHOR", 1);
        ht0Var.put("android.media.metadata.WRITER", 1);
        ht0Var.put("android.media.metadata.COMPOSER", 1);
        ht0Var.put("android.media.metadata.COMPILATION", 1);
        ht0Var.put("android.media.metadata.DATE", 1);
        ht0Var.put("android.media.metadata.YEAR", 0);
        ht0Var.put("android.media.metadata.GENRE", 1);
        ht0Var.put("android.media.metadata.TRACK_NUMBER", 0);
        ht0Var.put("android.media.metadata.NUM_TRACKS", 0);
        ht0Var.put("android.media.metadata.DISC_NUMBER", 0);
        ht0Var.put("android.media.metadata.ALBUM_ARTIST", 1);
        ht0Var.put("android.media.metadata.ART", 2);
        ht0Var.put("android.media.metadata.ART_URI", 1);
        ht0Var.put("android.media.metadata.ALBUM_ART", 2);
        ht0Var.put("android.media.metadata.ALBUM_ART_URI", 1);
        ht0Var.put("android.media.metadata.USER_RATING", 3);
        ht0Var.put("android.media.metadata.RATING", 3);
        ht0Var.put("android.media.metadata.DISPLAY_TITLE", 1);
        ht0Var.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        ht0Var.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        ht0Var.put("android.media.metadata.DISPLAY_ICON", 2);
        ht0Var.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        ht0Var.put("android.media.metadata.MEDIA_ID", 1);
        ht0Var.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        ht0Var.put("android.media.metadata.MEDIA_URI", 1);
        ht0Var.put("android.media.metadata.ADVERTISEMENT", 0);
        ht0Var.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        d = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER", "android.media.metadata.DISPLAY_SUBTITLE", "android.media.metadata.DISPLAY_DESCRIPTION"};
        CREATOR = new a();
    }

    public MediaMetadataCompat(Parcel parcel) {
        Bundle bundle = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        bundle.getClass();
        this.a = bundle;
    }

    public final long a(String str) {
        return this.a.getLong(str, 0L);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }

    public MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.a = bundle2;
        MediaSessionCompat.a(bundle2);
    }
}
