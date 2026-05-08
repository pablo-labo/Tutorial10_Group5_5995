package androidx.media3.session.legacy;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.e47;
import defpackage.qyc;
import defpackage.r6;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();
    public final CharSequence V;
    public final long W;
    public final List<CustomAction> X;
    public final long Y;
    public final Bundle Z;
    public final int a;
    public PlaybackState a0;
    public final long b;
    public final long c;
    public final float d;
    public final long e;
    public final int f;

    public class a implements Parcelable.Creator<PlaybackStateCompat> {
        @Override // android.os.Parcelable.Creator
        public final PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readLong();
        this.d = parcel.readFloat();
        this.W = parcel.readLong();
        this.c = parcel.readLong();
        this.e = parcel.readLong();
        this.V = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        List<CustomAction> listCreateTypedArrayList = parcel.createTypedArrayList(CustomAction.CREATOR);
        if (listCreateTypedArrayList == null) {
            e47.b bVar = e47.b;
            listCreateTypedArrayList = qyc.e;
        }
        this.X = listCreateTypedArrayList;
        this.Y = parcel.readLong();
        this.Z = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f = parcel.readInt();
    }

    public static PlaybackStateCompat a(PlaybackState playbackState) {
        ArrayList arrayList = null;
        if (playbackState == null) {
            return null;
        }
        List<PlaybackState.CustomAction> customActions = playbackState.getCustomActions();
        if (customActions != null) {
            arrayList = new ArrayList(customActions.size());
            for (PlaybackState.CustomAction customAction : customActions) {
                if (customAction != null) {
                    Bundle extras = customAction.getExtras();
                    MediaSessionCompat.a(extras);
                    CustomAction customAction2 = new CustomAction(customAction.getAction(), customAction.getName(), customAction.getIcon(), extras);
                    customAction2.e = customAction;
                    arrayList.add(customAction2);
                }
            }
        }
        Bundle extras2 = playbackState.getExtras();
        MediaSessionCompat.a(extras2);
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), 0, playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), arrayList, playbackState.getActiveQueueItemId(), extras2);
        playbackStateCompat.a0 = playbackState;
        return playbackStateCompat;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(this.b);
        sb.append(", buffered position=");
        sb.append(this.c);
        sb.append(", speed=");
        sb.append(this.d);
        sb.append(", updated=");
        sb.append(this.W);
        sb.append(", actions=");
        sb.append(this.e);
        sb.append(", error code=");
        sb.append(this.f);
        sb.append(", error message=");
        sb.append(this.V);
        sb.append(", custom actions=");
        sb.append(this.X);
        sb.append(", active item id=");
        return r6.d(this.Y, "}", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeLong(this.b);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.W);
        parcel.writeLong(this.c);
        parcel.writeLong(this.e);
        TextUtils.writeToParcel(this.V, parcel, i);
        parcel.writeTypedList(this.X);
        parcel.writeLong(this.Y);
        parcel.writeBundle(this.Z);
        parcel.writeInt(this.f);
    }

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();
        public final String a;
        public final CharSequence b;
        public final int c;
        public final Bundle d;
        public PlaybackState.CustomAction e;

        public class a implements Parcelable.Creator<CustomAction> {
            @Override // android.os.Parcelable.Creator
            public final CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        public CustomAction(Parcel parcel) {
            String string = parcel.readString();
            string.getClass();
            this.a = string;
            CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            charSequence.getClass();
            this.b = charSequence;
            this.c = parcel.readInt();
            this.d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.b) + ", mIcon=" + this.c + ", mExtras=" + this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
            TextUtils.writeToParcel(this.b, parcel, i);
            parcel.writeInt(this.c);
            parcel.writeBundle(this.d);
        }

        public CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.a = str;
            this.b = charSequence;
            this.c = i;
            this.d = bundle;
        }
    }

    public PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, ArrayList arrayList, long j5, Bundle bundle) {
        List<CustomAction> arrayList2;
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = f;
        this.e = j3;
        this.f = i2;
        this.V = charSequence;
        this.W = j4;
        if (arrayList == null) {
            e47.b bVar = e47.b;
            arrayList2 = qyc.e;
        } else {
            arrayList2 = new ArrayList<>(arrayList);
        }
        this.X = arrayList2;
        this.Y = j5;
        this.Z = bundle;
    }
}
