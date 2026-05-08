package com.facebook.react.fabric.mounting.mountitems;

import android.os.Trace;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.fabric.FabricUIManager;
import defpackage.jpf;
import defpackage.me1;
import defpackage.s55;
import defpackage.vse;
import defpackage.z55;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0001\u0018\u0000 #2\u00020\u0001:\u0001$B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001eR\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001e¨\u0006%"}, d2 = {"Lcom/facebook/react/fabric/mounting/mountitems/IntBufferBatchMountItem;", "Lme1;", "", "surfaceId", "", "intBuffer", "", "", "objBuffer", "commitNumber", "<init>", "(I[I[Ljava/lang/Object;I)V", "", "reason", "Lj6g;", "beginMarkers", "(Ljava/lang/String;)V", "endMarkers", "()V", "La0a;", "mountingManager", "execute", "(La0a;)V", "getSurfaceId", "()I", "", "isBatchEmpty", "()Z", "toString", "()Ljava/lang/String;", "I", "[I", "[Ljava/lang/Object;", "intBufferLen", "objBufferLen", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class IntBufferBatchMountItem implements me1 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final int INSTRUCTION_CREATE = 2;
    public static final int INSTRUCTION_DELETE = 4;
    public static final int INSTRUCTION_FLAG_MULTIPLE = 1;
    public static final int INSTRUCTION_INSERT = 8;
    public static final int INSTRUCTION_REMOVE = 16;
    public static final int INSTRUCTION_UPDATE_EVENT_EMITTER = 256;
    public static final int INSTRUCTION_UPDATE_LAYOUT = 128;
    public static final int INSTRUCTION_UPDATE_OVERFLOW_INSET = 1024;
    public static final int INSTRUCTION_UPDATE_PADDING = 512;
    public static final int INSTRUCTION_UPDATE_PROPS = 32;
    public static final int INSTRUCTION_UPDATE_STATE = 64;
    private static final String TAG = "IntBufferBatchMountItem";
    private final int commitNumber;
    private final int[] intBuffer;
    private final int intBufferLen;
    private final Object[] objBuffer;
    private final int objBufferLen;
    private final int surfaceId;

    /* JADX INFO: renamed from: com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem$a, reason: from kotlin metadata */
    public static final class Companion {
    }

    public IntBufferBatchMountItem(int i, int[] iArr, Object[] objArr, int i2) {
        iArr.getClass();
        objArr.getClass();
        this.surfaceId = i;
        this.intBuffer = iArr;
        this.objBuffer = objArr;
        this.commitNumber = i2;
        this.intBufferLen = iArr.length;
        this.objBufferLen = objArr.length;
    }

    private final void beginMarkers(String reason) {
        Trace.beginSection(jpf.g("IntBufferBatchMountItem::" + reason));
        int i = this.commitNumber;
        if (i > 0) {
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_BATCH_EXECUTION_START, null, i);
        }
    }

    private final void endMarkers() {
        int i = this.commitNumber;
        if (i > 0) {
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_BATCH_EXECUTION_END, null, i);
        }
        Trace.endSection();
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02ed  */
    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void execute(defpackage.a0a r33) {
        /*
            Method dump skipped, instruction units count: 1670
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem.execute(a0a):void");
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public int getSurfaceId() {
        return this.surfaceId;
    }

    @Override // defpackage.me1
    public boolean isBatchEmpty() {
        return this.intBufferLen == 0;
    }

    public String toString() {
        int i;
        int i2;
        int i3;
        int i4;
        try {
            StringBuilder sb = new StringBuilder();
            int i5 = 1;
            sb.append(String.format(Locale.ROOT, "IntBufferBatchMountItem [surface:%d]:\n", Arrays.copyOf(new Object[]{Integer.valueOf(this.surfaceId)}, 1)));
            int i6 = 0;
            int i7 = 0;
            while (i6 < this.intBufferLen) {
                int[] iArr = this.intBuffer;
                int i8 = i6 + 1;
                int i9 = iArr[i6];
                int i10 = i9 & (-2);
                if ((i9 & i5) != 0) {
                    int i11 = i6 + 2;
                    i = iArr[i8];
                    i8 = i11;
                } else {
                    i = i5;
                }
                i6 = i8;
                int i12 = 0;
                while (i12 < i) {
                    if (i10 == 2) {
                        i2 = i5;
                        String str = (String) this.objBuffer[i7];
                        if (str == null) {
                            str = "";
                        }
                        String str2 = z55.a.get(str);
                        if (str2 != null) {
                            str = str2;
                        }
                        i7 += 4;
                        Locale locale = Locale.ROOT;
                        int i13 = i6 + 1;
                        Integer numValueOf = Integer.valueOf(this.intBuffer[i6]);
                        i6 += 2;
                        sb.append(String.format(locale, "CREATE [%d] - layoutable:%d - %s\n", Arrays.copyOf(new Object[]{numValueOf, Integer.valueOf(this.intBuffer[i13]), str}, 3)));
                    } else if (i10 != 4) {
                        if (i10 == 8) {
                            Locale locale2 = Locale.ROOT;
                            Integer numValueOf2 = Integer.valueOf(this.intBuffer[i6]);
                            int i14 = i6 + 2;
                            Integer numValueOf3 = Integer.valueOf(this.intBuffer[i6 + 1]);
                            i6 += 3;
                            sb.append(String.format(locale2, "INSERT [%d]->[%d] @%d\n", Arrays.copyOf(new Object[]{numValueOf2, numValueOf3, Integer.valueOf(this.intBuffer[i14])}, 3)));
                        } else if (i10 != 16) {
                            String string = "<hidden>";
                            if (i10 == 32) {
                                i3 = i7 + 1;
                                Object obj = this.objBuffer[i7];
                                if (FabricUIManager.IS_DEVELOPMENT_ENVIRONMENT && (obj == null || (string = obj.toString()) == null)) {
                                    string = "<null>";
                                }
                                i4 = i6 + 1;
                                sb.append(String.format(Locale.ROOT, "UPDATE PROPS [%d]: %s\n", Arrays.copyOf(new Object[]{Integer.valueOf(this.intBuffer[i6]), string}, 2)));
                            } else if (i10 == 64) {
                                i3 = i7 + 1;
                                vse vseVar = (vse) this.objBuffer[i7];
                                if (FabricUIManager.IS_DEVELOPMENT_ENVIRONMENT && (vseVar == null || (string = vseVar.toString()) == null)) {
                                    string = "<null>";
                                }
                                i4 = i6 + 1;
                                sb.append(String.format(Locale.ROOT, "UPDATE STATE [%d]: %s\n", Arrays.copyOf(new Object[]{Integer.valueOf(this.intBuffer[i6]), string}, 2)));
                            } else if (i10 == 128) {
                                Locale locale3 = Locale.ROOT;
                                Integer numValueOf4 = Integer.valueOf(this.intBuffer[i6]);
                                Integer numValueOf5 = Integer.valueOf(this.intBuffer[i6 + 1]);
                                Integer numValueOf6 = Integer.valueOf(this.intBuffer[i6 + 2]);
                                Integer numValueOf7 = Integer.valueOf(this.intBuffer[i6 + 3]);
                                Integer numValueOf8 = Integer.valueOf(this.intBuffer[i6 + 4]);
                                Integer numValueOf9 = Integer.valueOf(this.intBuffer[i6 + 5]);
                                int i15 = i6 + 7;
                                Integer numValueOf10 = Integer.valueOf(this.intBuffer[i6 + 6]);
                                i6 += 8;
                                sb.append(String.format(locale3, "UPDATE LAYOUT [%d]->[%d]: x:%d y:%d w:%d h:%d displayType:%d layoutDirection:%d\n", Arrays.copyOf(new Object[]{numValueOf4, numValueOf5, numValueOf6, numValueOf7, numValueOf8, numValueOf9, numValueOf10, Integer.valueOf(this.intBuffer[i15])}, 8)));
                            } else if (i10 == 256) {
                                i7++;
                                sb.append(String.format(Locale.ROOT, "UPDATE EVENTEMITTER [%d]\n", Arrays.copyOf(new Object[]{Integer.valueOf(this.intBuffer[i6])}, 1)));
                                i6++;
                            } else if (i10 == 512) {
                                Locale locale4 = Locale.ROOT;
                                Integer numValueOf11 = Integer.valueOf(this.intBuffer[i6]);
                                Integer numValueOf12 = Integer.valueOf(this.intBuffer[i6 + 1]);
                                Integer numValueOf13 = Integer.valueOf(this.intBuffer[i6 + 2]);
                                int i16 = i6 + 4;
                                Integer numValueOf14 = Integer.valueOf(this.intBuffer[i6 + 3]);
                                i6 += 5;
                                sb.append(String.format(locale4, "UPDATE PADDING [%d]: top:%d right:%d bottom:%d left:%d\n", Arrays.copyOf(new Object[]{numValueOf11, numValueOf12, numValueOf13, numValueOf14, Integer.valueOf(this.intBuffer[i16])}, 5)));
                            } else {
                                if (i10 != 1024) {
                                    s55.f(TAG, "String so far: " + ((Object) sb));
                                    throw new IllegalArgumentException("Invalid type argument to IntBufferBatchMountItem: " + i10 + " at index: " + i6);
                                }
                                Locale locale5 = Locale.ROOT;
                                Integer numValueOf15 = Integer.valueOf(this.intBuffer[i6]);
                                Integer numValueOf16 = Integer.valueOf(this.intBuffer[i6 + 1]);
                                Integer numValueOf17 = Integer.valueOf(this.intBuffer[i6 + 2]);
                                int i17 = i6 + 4;
                                Integer numValueOf18 = Integer.valueOf(this.intBuffer[i6 + 3]);
                                i6 += 5;
                                sb.append(String.format(locale5, "UPDATE OVERFLOWINSET [%d]: left:%d top:%d right:%d bottom:%d\n", Arrays.copyOf(new Object[]{numValueOf15, numValueOf16, numValueOf17, numValueOf18, Integer.valueOf(this.intBuffer[i17])}, 5)));
                            }
                            i7 = i3;
                            i6 = i4;
                        } else {
                            Locale locale6 = Locale.ROOT;
                            Integer numValueOf19 = Integer.valueOf(this.intBuffer[i6]);
                            int i18 = i6 + 2;
                            Integer numValueOf20 = Integer.valueOf(this.intBuffer[i6 + 1]);
                            i6 += 3;
                            sb.append(String.format(locale6, "REMOVE [%d]->[%d] @%d\n", Arrays.copyOf(new Object[]{numValueOf19, numValueOf20, Integer.valueOf(this.intBuffer[i18])}, 3)));
                        }
                        i2 = 1;
                    } else {
                        i2 = 1;
                        sb.append(String.format(Locale.ROOT, "DELETE [%d]\n", Arrays.copyOf(new Object[]{Integer.valueOf(this.intBuffer[i6])}, 1)));
                        i6++;
                    }
                    i12++;
                    i5 = i2;
                }
            }
            return sb.toString();
        } catch (Exception e) {
            s55.g(TAG, "Caught exception trying to print", e);
            StringBuilder sb2 = new StringBuilder();
            for (int i19 = 0; i19 < this.intBufferLen; i19++) {
                sb2.append(this.intBuffer[i19]);
                sb2.append(", ");
            }
            s55.f(TAG, sb2.toString());
            for (int i20 = 0; i20 < this.objBufferLen; i20++) {
                String str3 = TAG;
                Object obj2 = this.objBuffer[i20];
                s55.f(str3, obj2 != null ? String.valueOf(obj2) : "null");
            }
            return "";
        }
    }
}
