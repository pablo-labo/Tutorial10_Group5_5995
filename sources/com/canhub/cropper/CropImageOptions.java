package com.canhub.cropper;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.TypedValue;
import com.canhub.cropper.CropImageView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.ia;
import defpackage.k6;
import defpackage.l5;
import defpackage.p6;
import defpackage.uz;
import defpackage.w40;
import defpackage.wl7;
import defpackage.zr4;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/canhub/cropper/CropImageOptions;", "Landroid/os/Parcelable;", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CropImageOptions implements Parcelable {
    public static final Parcelable.Creator<CropImageOptions> CREATOR = new a();
    public final int A0;
    public final CharSequence B0;
    public int C0;
    public Integer D0;
    public Uri E0;
    public Bitmap.CompressFormat F0;
    public int G0;
    public final int H0;
    public final int I0;
    public final CropImageView.j J0;
    public final boolean K0;
    public final Rect L0;
    public final int M0;
    public final boolean N0;
    public final boolean O0;
    public final boolean P0;
    public final int Q0;
    public final boolean R0;
    public final boolean S0;
    public final CharSequence T0;
    public final int U0;
    public final float V;
    public final boolean V0;
    public final CropImageView.d W;
    public final boolean W0;
    public final CropImageView.k X;
    public final String X0;
    public final boolean Y;
    public final List<String> Y0;
    public final boolean Z;
    public final float Z0;
    public final boolean a;
    public final boolean a0;
    public final int a1;
    public final boolean b;
    public final int b0;
    public final String b1;
    public CropImageView.c c;
    public final boolean c0;
    public int c1;
    public final CropImageView.a d;
    public final boolean d0;
    public Integer d1;
    public final float e;
    public final boolean e0;
    public Integer e1;
    public final float f;
    public final boolean f0;
    public Integer f1;
    public final int g0;
    public final Integer g1;
    public float h0;
    public boolean i0;
    public int j0;
    public int k0;
    public final float l0;
    public final int m0;
    public final float n0;
    public final float o0;
    public final float p0;
    public final int q0;
    public final int r0;
    public final float s0;
    public final int t0;
    public final int u0;
    public final int v0;
    public final int w0;
    public final int x0;
    public final int y0;
    public final int z0;

    public static final class a implements Parcelable.Creator<CropImageOptions> {
        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
            java.lang.NullPointerException
            	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
            	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
            */
        @Override // android.os.Parcelable.Creator
        public final com.canhub.cropper.CropImageOptions createFromParcel(
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r73v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            */
        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
            java.lang.NullPointerException
            	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
            	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
            */

        @Override // android.os.Parcelable.Creator
        public final CropImageOptions[] newArray(int i) {
            return new CropImageOptions[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CropImageOptions(CropImageView.c cVar, CropImageView.a aVar, float f, float f2, float f3, CropImageView.d dVar, CropImageView.k kVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, float f4, boolean z7, int i2, int i3, float f5, int i4, float f6, float f7, float f8, int i5, int i6, float f9, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, boolean z8, boolean z9, float f10, int i15, String str, int i16, int i17, int i18) {
        int i19;
        float fApplyDimension;
        boolean z10;
        int iArgb;
        CropImageView.c cVar2 = (i16 & 4) != 0 ? CropImageView.c.a : cVar;
        CropImageView.a aVar2 = (i16 & 8) != 0 ? CropImageView.a.a : aVar;
        float fApplyDimension2 = (i16 & 16) != 0 ? TypedValue.applyDimension(1, 10.0f, Resources.getSystem().getDisplayMetrics()) : f;
        float fApplyDimension3 = (i16 & 32) != 0 ? TypedValue.applyDimension(1, 3.0f, Resources.getSystem().getDisplayMetrics()) : f2;
        float fApplyDimension4 = (i16 & 64) != 0 ? TypedValue.applyDimension(1, 24.0f, Resources.getSystem().getDisplayMetrics()) : f3;
        CropImageView.d dVar2 = (i16 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? CropImageView.d.b : dVar;
        CropImageView.k kVar2 = (i16 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? CropImageView.k.a : kVar;
        boolean z11 = (i16 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? true : z;
        boolean z12 = (i16 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? false : z2;
        boolean z13 = (i16 & 2048) != 0 ? true : z3;
        int iRgb = Color.rgb(153, 51, 153);
        boolean z14 = (i16 & 8192) != 0 ? true : z4;
        boolean z15 = (i16 & 16384) != 0 ? false : z5;
        boolean z16 = (32768 & i16) != 0 ? true : z6;
        int i20 = (131072 & i16) != 0 ? 4 : i;
        float f11 = (262144 & i16) != 0 ? 0.0f : f4;
        boolean z17 = (524288 & i16) != 0 ? false : z7;
        int i21 = (1048576 & i16) != 0 ? 1 : i2;
        int i22 = (2097152 & i16) != 0 ? 1 : i3;
        if ((i16 & 4194304) != 0) {
            i19 = 4194304;
            fApplyDimension = TypedValue.applyDimension(1, 3.0f, Resources.getSystem().getDisplayMetrics());
        } else {
            i19 = 4194304;
            fApplyDimension = f5;
        }
        int iArgb2 = (i16 & 8388608) != 0 ? Color.argb(170, 255, 255, 255) : i4;
        float fApplyDimension5 = (16777216 & i16) != 0 ? TypedValue.applyDimension(1, 2.0f, Resources.getSystem().getDisplayMetrics()) : f6;
        float fApplyDimension6 = (33554432 & i16) != 0 ? TypedValue.applyDimension(1, 5.0f, Resources.getSystem().getDisplayMetrics()) : f7;
        float fApplyDimension7 = (67108864 & i16) != 0 ? TypedValue.applyDimension(1, 14.0f, Resources.getSystem().getDisplayMetrics()) : f8;
        int i23 = (134217728 & i16) != 0 ? -1 : i5;
        int i24 = (268435456 & i16) != 0 ? -1 : i6;
        float fApplyDimension8 = (536870912 & i16) != 0 ? TypedValue.applyDimension(1, 1.0f, Resources.getSystem().getDisplayMetrics()) : f9;
        int iArgb3 = (i16 & 1073741824) != 0 ? Color.argb(170, 255, 255, 255) : i7;
        if ((i16 & Integer.MIN_VALUE) != 0) {
            z10 = false;
            iArgb = Color.argb(119, 0, 0, 0);
        } else {
            z10 = false;
            iArgb = i8;
        }
        this(true, true, cVar2, aVar2, fApplyDimension2, fApplyDimension3, fApplyDimension4, dVar2, kVar2, z11, z12, z13, iRgb, z14, z15, z16, true, i20, f11, z17, i21, i22, fApplyDimension, iArgb2, fApplyDimension5, fApplyDimension6, fApplyDimension7, i23, i24, fApplyDimension8, iArgb3, iArgb, (i17 & 1) != 0 ? (int) TypedValue.applyDimension(1, 42.0f, Resources.getSystem().getDisplayMetrics()) : i9, (i17 & 2) != 0 ? (int) TypedValue.applyDimension(1, 42.0f, Resources.getSystem().getDisplayMetrics()) : i10, (i17 & 4) != 0 ? 40 : i11, (i17 & 8) != 0 ? 40 : i12, (i17 & 16) != 0 ? 99999 : i13, (i17 & 32) != 0 ? 99999 : i14, "", 0, null, null, Bitmap.CompressFormat.JPEG, 90, 0, 0, CropImageView.j.a, false, null, -1, true, true, false, 90, (i17 & i19) != 0 ? z10 : z8, (i17 & 8388608) != 0 ? z10 : z9, null, 0, false, false, null, zr4.a, (i17 & 1073741824) != 0 ? TypedValue.applyDimension(2, 20.0f, Resources.getSystem().getDisplayMetrics()) : f10, (i17 & Integer.MIN_VALUE) != 0 ? -1 : i15, (i18 & 1) != 0 ? "" : str, -1, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CropImageOptions)) {
            return false;
        }
        CropImageOptions cropImageOptions = (CropImageOptions) obj;
        return this.a == cropImageOptions.a && this.b == cropImageOptions.b && this.c == cropImageOptions.c && this.d == cropImageOptions.d && Float.compare(this.e, cropImageOptions.e) == 0 && Float.compare(this.f, cropImageOptions.f) == 0 && Float.compare(this.V, cropImageOptions.V) == 0 && this.W == cropImageOptions.W && this.X == cropImageOptions.X && this.Y == cropImageOptions.Y && this.Z == cropImageOptions.Z && this.a0 == cropImageOptions.a0 && this.b0 == cropImageOptions.b0 && this.c0 == cropImageOptions.c0 && this.d0 == cropImageOptions.d0 && this.e0 == cropImageOptions.e0 && this.f0 == cropImageOptions.f0 && this.g0 == cropImageOptions.g0 && Float.compare(this.h0, cropImageOptions.h0) == 0 && this.i0 == cropImageOptions.i0 && this.j0 == cropImageOptions.j0 && this.k0 == cropImageOptions.k0 && Float.compare(this.l0, cropImageOptions.l0) == 0 && this.m0 == cropImageOptions.m0 && Float.compare(this.n0, cropImageOptions.n0) == 0 && Float.compare(this.o0, cropImageOptions.o0) == 0 && Float.compare(this.p0, cropImageOptions.p0) == 0 && this.q0 == cropImageOptions.q0 && this.r0 == cropImageOptions.r0 && Float.compare(this.s0, cropImageOptions.s0) == 0 && this.t0 == cropImageOptions.t0 && this.u0 == cropImageOptions.u0 && this.v0 == cropImageOptions.v0 && this.w0 == cropImageOptions.w0 && this.x0 == cropImageOptions.x0 && this.y0 == cropImageOptions.y0 && this.z0 == cropImageOptions.z0 && this.A0 == cropImageOptions.A0 && wl7.b(this.B0, cropImageOptions.B0) && this.C0 == cropImageOptions.C0 && wl7.b(this.D0, cropImageOptions.D0) && wl7.b(this.E0, cropImageOptions.E0) && this.F0 == cropImageOptions.F0 && this.G0 == cropImageOptions.G0 && this.H0 == cropImageOptions.H0 && this.I0 == cropImageOptions.I0 && this.J0 == cropImageOptions.J0 && this.K0 == cropImageOptions.K0 && wl7.b(this.L0, cropImageOptions.L0) && this.M0 == cropImageOptions.M0 && this.N0 == cropImageOptions.N0 && this.O0 == cropImageOptions.O0 && this.P0 == cropImageOptions.P0 && this.Q0 == cropImageOptions.Q0 && this.R0 == cropImageOptions.R0 && this.S0 == cropImageOptions.S0 && wl7.b(this.T0, cropImageOptions.T0) && this.U0 == cropImageOptions.U0 && this.V0 == cropImageOptions.V0 && this.W0 == cropImageOptions.W0 && wl7.b(this.X0, cropImageOptions.X0) && wl7.b(this.Y0, cropImageOptions.Y0) && Float.compare(this.Z0, cropImageOptions.Z0) == 0 && this.a1 == cropImageOptions.a1 && wl7.b(this.b1, cropImageOptions.b1) && this.c1 == cropImageOptions.c1 && wl7.b(this.d1, cropImageOptions.d1) && wl7.b(this.e1, cropImageOptions.e1) && wl7.b(this.f1, cropImageOptions.f1) && wl7.b(this.g1, cropImageOptions.g1);
    }

    public final int hashCode() {
        int iC = w40.c(this.C0, (this.B0.hashCode() + w40.c(this.A0, w40.c(this.z0, w40.c(this.y0, w40.c(this.x0, w40.c(this.w0, w40.c(this.v0, w40.c(this.u0, w40.c(this.t0, k6.c(w40.c(this.r0, w40.c(this.q0, k6.c(k6.c(k6.c(w40.c(this.m0, k6.c(w40.c(this.k0, w40.c(this.j0, ia.f(k6.c(w40.c(this.g0, ia.f(ia.f(ia.f(ia.f(w40.c(this.b0, ia.f(ia.f(ia.f((this.X.hashCode() + ((this.W.hashCode() + k6.c(k6.c(k6.c((this.d.hashCode() + ((this.c.hashCode() + ia.f(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31, this.e, 31), this.f, 31), this.V, 31)) * 31)) * 31, 31, this.Y), 31, this.Z), 31, this.a0), 31), 31, this.c0), 31, this.d0), 31, this.e0), 31, this.f0), 31), this.h0, 31), 31, this.i0), 31), 31), this.l0, 31), 31), this.n0, 31), this.o0, 31), this.p0, 31), 31), 31), this.s0, 31), 31), 31), 31), 31), 31), 31), 31), 31)) * 31, 31);
        Integer num = this.D0;
        int iHashCode = (iC + (num == null ? 0 : num.hashCode())) * 31;
        Uri uri = this.E0;
        int iF = ia.f((this.J0.hashCode() + w40.c(this.I0, w40.c(this.H0, w40.c(this.G0, (this.F0.hashCode() + ((iHashCode + (uri == null ? 0 : uri.hashCode())) * 31)) * 31, 31), 31), 31)) * 31, 31, this.K0);
        Rect rect = this.L0;
        int iF2 = ia.f(ia.f(w40.c(this.Q0, ia.f(ia.f(ia.f(w40.c(this.M0, (iF + (rect == null ? 0 : rect.hashCode())) * 31, 31), 31, this.N0), 31, this.O0), 31, this.P0), 31), 31, this.R0), 31, this.S0);
        CharSequence charSequence = this.T0;
        int iF3 = ia.f(ia.f(w40.c(this.U0, (iF2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31), 31, this.V0), 31, this.W0);
        String str = this.X0;
        int iHashCode2 = (iF3 + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.Y0;
        int iC2 = w40.c(this.a1, k6.c((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31, this.Z0, 31), 31);
        String str2 = this.b1;
        int iC3 = w40.c(this.c1, (iC2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Integer num2 = this.d1;
        int iHashCode3 = (iC3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.e1;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f1;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.g1;
        return iHashCode5 + (num5 != null ? num5.hashCode() : 0);
    }

    public final String toString() {
        CropImageView.c cVar = this.c;
        float f = this.h0;
        boolean z = this.i0;
        int i = this.j0;
        int i2 = this.k0;
        int i3 = this.C0;
        Integer num = this.D0;
        Uri uri = this.E0;
        Bitmap.CompressFormat compressFormat = this.F0;
        int i4 = this.G0;
        int i5 = this.c1;
        Integer num2 = this.d1;
        Integer num3 = this.e1;
        Integer num4 = this.f1;
        StringBuilder sb = new StringBuilder("CropImageOptions(imageSourceIncludeGallery=");
        sb.append(this.a);
        sb.append(", imageSourceIncludeCamera=");
        sb.append(this.b);
        sb.append(", cropShape=");
        sb.append(cVar);
        sb.append(", cornerShape=");
        sb.append(this.d);
        sb.append(", cropCornerRadius=");
        sb.append(this.e);
        sb.append(", snapRadius=");
        sb.append(this.f);
        sb.append(", touchRadius=");
        sb.append(this.V);
        sb.append(", guidelines=");
        sb.append(this.W);
        sb.append(", scaleType=");
        sb.append(this.X);
        sb.append(", showCropOverlay=");
        sb.append(this.Y);
        sb.append(", showCropLabel=");
        p6.j(sb, this.Z, ", showProgressBar=", this.a0, ", progressBarColor=");
        sb.append(this.b0);
        sb.append(", autoZoomEnabled=");
        sb.append(this.c0);
        sb.append(", multiTouchEnabled=");
        p6.j(sb, this.d0, ", centerMoveEnabled=", this.e0, ", canChangeCropWindow=");
        sb.append(this.f0);
        sb.append(", maxZoom=");
        sb.append(this.g0);
        sb.append(", initialCropWindowPaddingRatio=");
        sb.append(f);
        sb.append(", fixAspectRatio=");
        sb.append(z);
        sb.append(", aspectRatioX=");
        uz.i(sb, i, ", aspectRatioY=", i2, ", borderLineThickness=");
        sb.append(this.l0);
        sb.append(", borderLineColor=");
        sb.append(this.m0);
        sb.append(", borderCornerThickness=");
        sb.append(this.n0);
        sb.append(", borderCornerOffset=");
        sb.append(this.o0);
        sb.append(", borderCornerLength=");
        sb.append(this.p0);
        sb.append(", borderCornerColor=");
        sb.append(this.q0);
        sb.append(", circleCornerFillColorHexValue=");
        sb.append(this.r0);
        sb.append(", guidelinesThickness=");
        sb.append(this.s0);
        sb.append(", guidelinesColor=");
        uz.i(sb, this.t0, ", backgroundColor=", this.u0, ", minCropWindowWidth=");
        uz.i(sb, this.v0, ", minCropWindowHeight=", this.w0, ", minCropResultWidth=");
        uz.i(sb, this.x0, ", minCropResultHeight=", this.y0, ", maxCropResultWidth=");
        uz.i(sb, this.z0, ", maxCropResultHeight=", this.A0, ", activityTitle=");
        sb.append((Object) this.B0);
        sb.append(", activityMenuIconColor=");
        sb.append(i3);
        sb.append(", activityMenuTextColor=");
        sb.append(num);
        sb.append(", customOutputUri=");
        sb.append(uri);
        sb.append(", outputCompressFormat=");
        sb.append(compressFormat);
        sb.append(", outputCompressQuality=");
        sb.append(i4);
        sb.append(", outputRequestWidth=");
        uz.i(sb, this.H0, ", outputRequestHeight=", this.I0, ", outputRequestSizeOptions=");
        sb.append(this.J0);
        sb.append(", noOutputImage=");
        sb.append(this.K0);
        sb.append(", initialCropWindowRectangle=");
        sb.append(this.L0);
        sb.append(", initialRotation=");
        sb.append(this.M0);
        sb.append(", allowRotation=");
        p6.j(sb, this.N0, ", allowFlipping=", this.O0, ", allowCounterRotation=");
        sb.append(this.P0);
        sb.append(", rotationDegrees=");
        sb.append(this.Q0);
        sb.append(", flipHorizontally=");
        p6.j(sb, this.R0, ", flipVertically=", this.S0, ", cropMenuCropButtonTitle=");
        sb.append((Object) this.T0);
        sb.append(", cropMenuCropButtonIcon=");
        sb.append(this.U0);
        sb.append(", skipEditing=");
        p6.j(sb, this.V0, ", showIntentChooser=", this.W0, ", intentChooserTitle=");
        sb.append(this.X0);
        sb.append(", intentChooserPriorityList=");
        sb.append(this.Y0);
        sb.append(", cropperLabelTextSize=");
        sb.append(this.Z0);
        sb.append(", cropperLabelTextColor=");
        sb.append(this.a1);
        sb.append(", cropperLabelText=");
        sb.append(this.b1);
        sb.append(", activityBackgroundColor=");
        sb.append(i5);
        sb.append(", toolbarColor=");
        sb.append(num2);
        sb.append(", toolbarTitleColor=");
        sb.append(num3);
        sb.append(", toolbarBackButtonColor=");
        sb.append(num4);
        sb.append(", toolbarTintColor=");
        sb.append(this.g1);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeString(this.c.name());
        parcel.writeString(this.d.name());
        parcel.writeFloat(this.e);
        parcel.writeFloat(this.f);
        parcel.writeFloat(this.V);
        parcel.writeString(this.W.name());
        parcel.writeString(this.X.name());
        parcel.writeInt(this.Y ? 1 : 0);
        parcel.writeInt(this.Z ? 1 : 0);
        parcel.writeInt(this.a0 ? 1 : 0);
        parcel.writeInt(this.b0);
        parcel.writeInt(this.c0 ? 1 : 0);
        parcel.writeInt(this.d0 ? 1 : 0);
        parcel.writeInt(this.e0 ? 1 : 0);
        parcel.writeInt(this.f0 ? 1 : 0);
        parcel.writeInt(this.g0);
        parcel.writeFloat(this.h0);
        parcel.writeInt(this.i0 ? 1 : 0);
        parcel.writeInt(this.j0);
        parcel.writeInt(this.k0);
        parcel.writeFloat(this.l0);
        parcel.writeInt(this.m0);
        parcel.writeFloat(this.n0);
        parcel.writeFloat(this.o0);
        parcel.writeFloat(this.p0);
        parcel.writeInt(this.q0);
        parcel.writeInt(this.r0);
        parcel.writeFloat(this.s0);
        parcel.writeInt(this.t0);
        parcel.writeInt(this.u0);
        parcel.writeInt(this.v0);
        parcel.writeInt(this.w0);
        parcel.writeInt(this.x0);
        parcel.writeInt(this.y0);
        parcel.writeInt(this.z0);
        parcel.writeInt(this.A0);
        TextUtils.writeToParcel(this.B0, parcel, i);
        parcel.writeInt(this.C0);
        Integer num = this.D0;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeParcelable(this.E0, i);
        parcel.writeString(this.F0.name());
        parcel.writeInt(this.G0);
        parcel.writeInt(this.H0);
        parcel.writeInt(this.I0);
        parcel.writeString(this.J0.name());
        parcel.writeInt(this.K0 ? 1 : 0);
        parcel.writeParcelable(this.L0, i);
        parcel.writeInt(this.M0);
        parcel.writeInt(this.N0 ? 1 : 0);
        parcel.writeInt(this.O0 ? 1 : 0);
        parcel.writeInt(this.P0 ? 1 : 0);
        parcel.writeInt(this.Q0);
        parcel.writeInt(this.R0 ? 1 : 0);
        parcel.writeInt(this.S0 ? 1 : 0);
        TextUtils.writeToParcel(this.T0, parcel, i);
        parcel.writeInt(this.U0);
        parcel.writeInt(this.V0 ? 1 : 0);
        parcel.writeInt(this.W0 ? 1 : 0);
        parcel.writeString(this.X0);
        parcel.writeStringList(this.Y0);
        parcel.writeFloat(this.Z0);
        parcel.writeInt(this.a1);
        parcel.writeString(this.b1);
        parcel.writeInt(this.c1);
        Integer num2 = this.d1;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.e1;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.f1;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        Integer num5 = this.g1;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
    }

    public CropImageOptions(boolean z, boolean z2, CropImageView.c cVar, CropImageView.a aVar, float f, float f2, float f3, CropImageView.d dVar, CropImageView.k kVar, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7, float f9, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, Integer num, Uri uri, Bitmap.CompressFormat compressFormat, int i17, int i18, int i19, CropImageView.j jVar, boolean z11, Rect rect, int i20, boolean z12, boolean z13, boolean z14, int i21, boolean z15, boolean z16, CharSequence charSequence2, int i22, boolean z17, boolean z18, String str, List<String> list, float f10, int i23, String str2, int i24, Integer num2, Integer num3, Integer num4, Integer num5) {
        cVar.getClass();
        aVar.getClass();
        dVar.getClass();
        kVar.getClass();
        charSequence.getClass();
        compressFormat.getClass();
        jVar.getClass();
        this.a = z;
        this.b = z2;
        this.c = cVar;
        this.d = aVar;
        this.e = f;
        this.f = f2;
        this.V = f3;
        this.W = dVar;
        this.X = kVar;
        this.Y = z3;
        this.Z = z4;
        this.a0 = z5;
        this.b0 = i;
        this.c0 = z6;
        this.d0 = z7;
        this.e0 = z8;
        this.f0 = z9;
        this.g0 = i2;
        this.h0 = f4;
        this.i0 = z10;
        this.j0 = i3;
        this.k0 = i4;
        this.l0 = f5;
        this.m0 = i5;
        this.n0 = f6;
        this.o0 = f7;
        this.p0 = f8;
        this.q0 = i6;
        this.r0 = i7;
        this.s0 = f9;
        this.t0 = i8;
        this.u0 = i9;
        this.v0 = i10;
        this.w0 = i11;
        this.x0 = i12;
        this.y0 = i13;
        this.z0 = i14;
        this.A0 = i15;
        this.B0 = charSequence;
        this.C0 = i16;
        this.D0 = num;
        this.E0 = uri;
        this.F0 = compressFormat;
        this.G0 = i17;
        this.H0 = i18;
        this.I0 = i19;
        this.J0 = jVar;
        this.K0 = z11;
        this.L0 = rect;
        this.M0 = i20;
        this.N0 = z12;
        this.O0 = z13;
        this.P0 = z14;
        this.Q0 = i21;
        this.R0 = z15;
        this.S0 = z16;
        this.T0 = charSequence2;
        this.U0 = i22;
        this.V0 = z17;
        this.W0 = z18;
        this.X0 = str;
        this.Y0 = list;
        this.Z0 = f10;
        this.a1 = i23;
        this.b1 = str2;
        this.c1 = i24;
        this.d1 = num2;
        this.e1 = num3;
        this.f1 = num4;
        this.g1 = num5;
        if (i2 < 0) {
            l5.q("Cannot set max zoom to a number < 1");
            throw null;
        }
        if (f3 < 0.0f) {
            l5.q("Cannot set touch radius value to a number <= 0 ");
            throw null;
        }
        if (f4 < 0.0f || f4 >= 0.5d) {
            l5.q("Cannot set initial crop window padding value to a number < 0 or >= 0.5");
            throw null;
        }
        if (i3 <= 0) {
            l5.q("Cannot set aspect ratio value to a number less than or equal to 0.");
            throw null;
        }
        if (i4 <= 0) {
            l5.q("Cannot set aspect ratio value to a number less than or equal to 0.");
            throw null;
        }
        if (f5 < 0.0f) {
            l5.q("Cannot set line thickness value to a number less than 0.");
            throw null;
        }
        if (f6 < 0.0f) {
            l5.q("Cannot set corner thickness value to a number less than 0.");
            throw null;
        }
        if (f9 < 0.0f) {
            l5.q("Cannot set guidelines thickness value to a number less than 0.");
            throw null;
        }
        if (i11 < 0) {
            l5.q("Cannot set min crop window height value to a number < 0 ");
            throw null;
        }
        if (i12 < 0) {
            l5.q("Cannot set min crop result width value to a number < 0 ");
            throw null;
        }
        if (i13 < 0) {
            l5.q("Cannot set min crop result height value to a number < 0 ");
            throw null;
        }
        if (i14 < i12) {
            l5.q("Cannot set max crop result width to smaller value than min crop result width");
            throw null;
        }
        if (i15 < i13) {
            l5.q("Cannot set max crop result height to smaller value than min crop result height");
            throw null;
        }
        if (i18 < 0) {
            l5.q("Cannot set request width value to a number < 0 ");
            throw null;
        }
        if (i19 < 0) {
            l5.q("Cannot set request height value to a number < 0 ");
            throw null;
        }
        if (i21 < 0 || i21 > 360) {
            l5.q("Cannot set rotation degrees value to a number < 0 or > 360");
            throw null;
        }
    }

    public CropImageOptions() {
        this(null, null, 0.0f, 0.0f, 0.0f, null, null, false, false, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, false, 0.0f, 0, null, -1, -1, 63);
    }
}
