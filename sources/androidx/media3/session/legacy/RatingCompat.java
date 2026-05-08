package androidx.media3.session.legacy;

import android.annotation.SuppressLint;
import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();
    public final int a;
    public final float b;
    public Object c;

    public class a implements Parcelable.Creator<RatingCompat> {
        @Override // android.os.Parcelable.Creator
        public final RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readFloat(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    public RatingCompat(float f, int i) {
        this.a = i;
        this.b = f;
    }

    @SuppressLint({"WrongConstant"})
    public static RatingCompat a(Parcelable parcelable) {
        RatingCompat ratingCompat;
        RatingCompat ratingCompat2 = null;
        if (parcelable != null) {
            Rating rating = (Rating) parcelable;
            int ratingStyle = rating.getRatingStyle();
            if (!rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        ratingCompat2 = new RatingCompat(-1.0f, ratingStyle);
                        break;
                }
            } else {
                switch (ratingStyle) {
                    case 1:
                        ratingCompat = new RatingCompat(rating.hasHeart() ? 1.0f : 0.0f, 1);
                        break;
                    case 2:
                        ratingCompat = new RatingCompat(rating.isThumbUp() ? 1.0f : 0.0f, 2);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompat2 = e(rating.getStarRating(), ratingStyle);
                        break;
                    case 6:
                        ratingCompat2 = d(rating.getPercentRating());
                        break;
                }
                ratingCompat2 = ratingCompat;
            }
            ratingCompat2.getClass();
            ratingCompat2.c = parcelable;
        }
        return ratingCompat2;
    }

    public static RatingCompat d(float f) {
        if (f >= 0.0f && f <= 100.0f) {
            return new RatingCompat(f, 6);
        }
        Log.e("Rating", "Invalid percentage-based rating value");
        return null;
    }

    public static RatingCompat e(float f, int i) {
        float f2;
        if (i == 3) {
            f2 = 3.0f;
        } else if (i == 4) {
            f2 = 4.0f;
        } else {
            if (i != 5) {
                Log.e("Rating", "Invalid rating style (" + i + ") for a star rating");
                return null;
            }
            f2 = 5.0f;
        }
        if (f >= 0.0f && f <= f2) {
            return new RatingCompat(f, i);
        }
        Log.e("Rating", "Trying to set out of range star-based rating");
        return null;
    }

    public final float b() {
        int i = this.a;
        if ((i == 3 || i == 4 || i == 5) && c()) {
            return this.b;
        }
        return -1.0f;
    }

    public final boolean c() {
        return this.b >= 0.0f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.a);
        sb.append(" rating=");
        float f = this.b;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeFloat(this.b);
    }
}
