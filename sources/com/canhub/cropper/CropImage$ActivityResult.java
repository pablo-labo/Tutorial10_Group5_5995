package com.canhub.cropper;

import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.canhub.cropper.CropImageView;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"com/canhub/cropper/CropImage$ActivityResult", "Lcom/canhub/cropper/CropImageView$b;", "Landroid/os/Parcelable;", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class CropImage$ActivityResult extends CropImageView.b implements Parcelable {
    public static final Parcelable.Creator<CropImage$ActivityResult> CREATOR = new a();

    public static final class a implements Parcelable.Creator<CropImage$ActivityResult> {
        @Override // android.os.Parcelable.Creator
        public final CropImage$ActivityResult createFromParcel(Parcel parcel) {
            parcel.getClass();
            Uri uri = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
            Uri uri2 = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
            Exception exc = (Exception) parcel.readSerializable();
            float[] fArrCreateFloatArray = parcel.createFloatArray();
            fArrCreateFloatArray.getClass();
            return new CropImage$ActivityResult(uri, uri2, exc, fArrCreateFloatArray, (Rect) parcel.readParcelable(Rect.class.getClassLoader()), (Rect) parcel.readParcelable(Rect.class.getClassLoader()), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final CropImage$ActivityResult[] newArray(int i) {
            return new CropImage$ActivityResult[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeSerializable(this.c);
        parcel.writeFloatArray(this.d);
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
        parcel.writeInt(this.V);
        parcel.writeInt(this.W);
    }
}
