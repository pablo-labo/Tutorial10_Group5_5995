package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.provider.Settings;
import android.widget.ImageView;
import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.airbnb.lottie.compose.LottieAnimationSizeElement;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.c20;
import defpackage.ft2;
import defpackage.j79;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class n69 {

    public static final class a extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ int $$default;
        final /* synthetic */ c20 $alignment;
        final /* synthetic */ boolean $applyOpacityToLayers;
        final /* synthetic */ boolean $applyShadowToLayers;
        final /* synthetic */ aw0 $asyncUpdates;
        final /* synthetic */ boolean $clipTextToBoundingBox;
        final /* synthetic */ boolean $clipToCompositionBounds;
        final /* synthetic */ s69 $composition;
        final /* synthetic */ ft2 $contentScale;
        final /* synthetic */ k79 $dynamicProperties;
        final /* synthetic */ boolean $enableMergePaths;
        final /* synthetic */ Map<String, Typeface> $fontMap;
        final /* synthetic */ boolean $maintainOriginalImageBounds;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ boolean $outlineMasksAndMattes;
        final /* synthetic */ gu5<Float> $progress;
        final /* synthetic */ s1d $renderMode;
        final /* synthetic */ boolean $safeMode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(s69 s69Var, gu5<Float> gu5Var, androidx.compose.ui.e eVar, boolean z, boolean z2, boolean z3, boolean z4, s1d s1dVar, boolean z5, k79 k79Var, c20 c20Var, ft2 ft2Var, boolean z6, boolean z7, Map<String, ? extends Typeface> map, aw0 aw0Var, boolean z8, int i, int i2, int i3) {
            super(2);
            this.$composition = s69Var;
            this.$progress = gu5Var;
            this.$modifier = eVar;
            this.$outlineMasksAndMattes = z;
            this.$applyOpacityToLayers = z2;
            this.$applyShadowToLayers = z3;
            this.$enableMergePaths = z4;
            this.$renderMode = s1dVar;
            this.$maintainOriginalImageBounds = z5;
            this.$dynamicProperties = k79Var;
            this.$alignment = c20Var;
            this.$contentScale = ft2Var;
            this.$clipToCompositionBounds = z6;
            this.$clipTextToBoundingBox = z7;
            this.$fontMap = map;
            this.$asyncUpdates = aw0Var;
            this.$safeMode = z8;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            n69.a(this.$composition, this.$progress, this.$modifier, this.$outlineMasksAndMattes, this.$applyOpacityToLayers, this.$applyShadowToLayers, this.$enableMergePaths, this.$renderMode, this.$maintainOriginalImageBounds, this.$dynamicProperties, this.$alignment, this.$contentScale, this.$clipToCompositionBounds, this.$clipTextToBoundingBox, this.$fontMap, this.$asyncUpdates, this.$safeMode, bVar, ka2.L(this.$$changed | 1), ka2.L(this.$$changed1), this.$$default);
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function1<gb4, j6g> {
        final /* synthetic */ c20 $alignment;
        final /* synthetic */ boolean $applyOpacityToLayers;
        final /* synthetic */ boolean $applyShadowToLayers;
        final /* synthetic */ aw0 $asyncUpdates;
        final /* synthetic */ Rect $bounds;
        final /* synthetic */ boolean $clipTextToBoundingBox;
        final /* synthetic */ boolean $clipToCompositionBounds;
        final /* synthetic */ s69 $composition;
        final /* synthetic */ ft2 $contentScale;
        final /* synthetic */ Context $context;
        final /* synthetic */ j79 $drawable;
        final /* synthetic */ k79 $dynamicProperties;
        final /* synthetic */ boolean $enableMergePaths;
        final /* synthetic */ Map<String, Typeface> $fontMap;
        final /* synthetic */ boolean $maintainOriginalImageBounds;
        final /* synthetic */ Matrix $matrix;
        final /* synthetic */ boolean $outlineMasksAndMattes;
        final /* synthetic */ gu5<Float> $progress;
        final /* synthetic */ s1d $renderMode;
        final /* synthetic */ boolean $safeMode;
        final /* synthetic */ g4a<k79> $setDynamicProperties$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Rect rect, ft2 ft2Var, c20 c20Var, Matrix matrix, j79 j79Var, boolean z, boolean z2, s1d s1dVar, aw0 aw0Var, s69 s69Var, Map<String, ? extends Typeface> map, k79 k79Var, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, Context context, gu5<Float> gu5Var, g4a<k79> g4aVar) {
            super(1);
            this.$bounds = rect;
            this.$contentScale = ft2Var;
            this.$alignment = c20Var;
            this.$matrix = matrix;
            this.$drawable = j79Var;
            this.$enableMergePaths = z;
            this.$safeMode = z2;
            this.$renderMode = s1dVar;
            this.$asyncUpdates = aw0Var;
            this.$composition = s69Var;
            this.$fontMap = map;
            this.$dynamicProperties = k79Var;
            this.$outlineMasksAndMattes = z3;
            this.$applyOpacityToLayers = z4;
            this.$applyShadowToLayers = z5;
            this.$maintainOriginalImageBounds = z6;
            this.$clipToCompositionBounds = z7;
            this.$clipTextToBoundingBox = z8;
            this.$context = context;
            this.$progress = gu5Var;
            this.$setDynamicProperties$delegate = g4aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(gb4 gb4Var) {
            boolean zRemove;
            gb4 gb4Var2 = gb4Var;
            gb4Var2.getClass();
            Rect rect = this.$bounds;
            ft2 ft2Var = this.$contentScale;
            c20 c20Var = this.$alignment;
            Matrix matrix = this.$matrix;
            j79 j79Var = this.$drawable;
            boolean z = this.$enableMergePaths;
            boolean z2 = this.$safeMode;
            s1d s1dVar = this.$renderMode;
            aw0 aw0Var = this.$asyncUpdates;
            s69 s69Var = this.$composition;
            Map<String, Typeface> map = this.$fontMap;
            k79 k79Var = this.$dynamicProperties;
            boolean z3 = this.$outlineMasksAndMattes;
            boolean z4 = this.$applyOpacityToLayers;
            boolean z5 = this.$applyShadowToLayers;
            boolean z6 = this.$maintainOriginalImageBounds;
            boolean z7 = this.$clipToCompositionBounds;
            boolean z8 = this.$clipTextToBoundingBox;
            Context context = this.$context;
            gu5<Float> gu5Var = this.$progress;
            g4a<k79> g4aVar = this.$setDynamicProperties$delegate;
            ww1 ww1VarA = gb4Var2.w1().a();
            long jE = oie.e(rect.width(), rect.height());
            long jG = hh1.g(gf9.b(kie.d(gb4Var2.c())), gf9.b(kie.b(gb4Var2.c())));
            long jA = ft2Var.a(jE, gb4Var2.c());
            float fD = kie.d(jE);
            int i = wmd.a;
            int i2 = (int) (jA >> 32);
            int i3 = (int) (jA & 4294967295L);
            long jA2 = c20Var.a(hh1.g((int) (Float.intBitsToFloat(i2) * fD), (int) (Float.intBitsToFloat(i3) * kie.b(jE))), jG, gb4Var2.getLayoutDirection());
            matrix.reset();
            matrix.preTranslate((int) (jA2 >> 32), (int) (jA2 & 4294967295L));
            matrix.preScale(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3));
            m79 m79Var = j79Var.Y;
            t79 t79Var = j79Var.b;
            HashSet<l79> hashSet = m79Var.a;
            l79 l79Var = l79.a;
            if (z) {
                int i4 = Build.VERSION.SDK_INT;
                int i5 = l79Var.minRequiredSdkVersion;
                if (i4 < i5) {
                    a49.b(String.format("%s is not supported pre SDK %d", "MergePathsApi19", Integer.valueOf(i5)));
                    zRemove = false;
                } else {
                    zRemove = hashSet.add(l79Var);
                }
            } else {
                zRemove = hashSet.remove(l79Var);
            }
            if (j79Var.a != null && zRemove) {
                j79Var.b();
            }
            j79Var.d = z2;
            j79Var.h0 = s1dVar;
            j79Var.c();
            j79Var.x0 = aw0Var;
            ArrayList<j79.a> arrayList = j79Var.f;
            if (j79Var.a != s69Var) {
                j79Var.w0 = true;
                if (t79Var.b0) {
                    t79Var.cancel();
                    if (!j79Var.isVisible()) {
                        j79Var.e = j79.b.a;
                    }
                }
                j79Var.a = null;
                j79Var.b0 = null;
                j79Var.V = null;
                j79Var.A0 = -3.4028235E38f;
                t79Var.a0 = null;
                t79Var.Y = -2.14748365E9f;
                t79Var.Z = 2.14748365E9f;
                j79Var.invalidateSelf();
                j79Var.a = s69Var;
                j79Var.b();
                boolean z9 = t79Var.a0 == null;
                t79Var.a0 = s69Var;
                if (z9) {
                    t79Var.k(Math.max(t79Var.Y, s69Var.l), Math.min(t79Var.Z, s69Var.m));
                } else {
                    t79Var.k((int) s69Var.l, (int) s69Var.m);
                }
                float f = t79Var.W;
                t79Var.W = 0.0f;
                t79Var.V = 0.0f;
                t79Var.j((int) f);
                t79Var.d();
                j79Var.l(t79Var.getAnimatedFraction());
                Iterator it = new ArrayList(arrayList).iterator();
                while (it.hasNext()) {
                    j79.a aVar = (j79.a) it.next();
                    if (aVar != null) {
                        aVar.run();
                    }
                    it.remove();
                }
                arrayList.clear();
                s69Var.a.getClass();
                j79Var.c();
                Drawable.Callback callback = j79Var.getCallback();
                if (callback instanceof ImageView) {
                    ImageView imageView = (ImageView) callback;
                    imageView.setImageDrawable(null);
                    imageView.setImageDrawable(j79Var);
                }
            }
            if (map != j79Var.X) {
                j79Var.X = map;
                j79Var.invalidateSelf();
            }
            if (k79Var != g4aVar.getValue()) {
                if (g4aVar.getValue() != null || k79Var != null) {
                    throw null;
                }
                g4aVar.setValue(k79Var);
            }
            if (j79Var.d0 != z3) {
                j79Var.d0 = z3;
                lm2 lm2Var = j79Var.b0;
                if (lm2Var != null) {
                    lm2Var.o(z3);
                }
            }
            j79Var.e0 = z4;
            j79Var.f0 = z5;
            j79Var.Z = z6;
            if (z7 != j79Var.a0) {
                j79Var.a0 = z7;
                lm2 lm2Var2 = j79Var.b0;
                if (lm2Var2 != null) {
                    lm2Var2.L = z7;
                }
                j79Var.invalidateSelf();
            }
            if (z8 != j79Var.g0) {
                j79Var.g0 = z8;
                j79Var.invalidateSelf();
            }
            be9 be9VarG = j79Var.g();
            if (j79Var.a(context) || be9VarG == null) {
                j79Var.l(gu5Var.invoke().floatValue());
            } else {
                j79Var.l(be9VarG.b);
            }
            j79Var.setBounds(0, 0, rect.width(), rect.height());
            Canvas canvasA = z40.a(ww1VarA);
            qr3 qr3Var = j79Var.z0;
            ThreadPoolExecutor threadPoolExecutor = j79.C0;
            Semaphore semaphore = j79Var.y0;
            lm2 lm2Var3 = j79Var.b0;
            s69 s69Var2 = j79Var.a;
            if (lm2Var3 != null && s69Var2 != null) {
                aw0 aw0Var2 = j79Var.x0;
                if (aw0Var2 == null) {
                    aw0Var2 = aw0.a;
                }
                boolean z10 = aw0Var2 == aw0.b;
                if (z10) {
                    try {
                        semaphore.acquire();
                        if (j79Var.m()) {
                            j79Var.l(t79Var.e());
                        }
                    } catch (InterruptedException unused) {
                        if (z10) {
                            semaphore.release();
                            if (lm2Var3.K != t79Var.e()) {
                            }
                        }
                        return j6g.a;
                    } catch (Throwable th) {
                        if (z10) {
                            semaphore.release();
                            if (lm2Var3.K != t79Var.e()) {
                                threadPoolExecutor.execute(qr3Var);
                            }
                        }
                        throw th;
                    }
                }
                boolean z11 = j79Var.d;
                int i6 = j79Var.c0;
                boolean z12 = j79Var.i0;
                if (z11) {
                    try {
                        if (z12) {
                            canvasA.save();
                            canvasA.concat(matrix);
                            j79Var.i(canvasA, lm2Var3);
                            canvasA.restore();
                        } else {
                            lm2Var3.h(canvasA, matrix, i6, null);
                        }
                    } catch (Throwable unused2) {
                        a49.a.getClass();
                    }
                } else if (z12) {
                    canvasA.save();
                    canvasA.concat(matrix);
                    j79Var.i(canvasA, lm2Var3);
                    canvasA.restore();
                } else {
                    lm2Var3.h(canvasA, matrix, i6, null);
                }
                j79Var.w0 = false;
                if (z10) {
                    semaphore.release();
                    if (lm2Var3.K != t79Var.e()) {
                        threadPoolExecutor.execute(qr3Var);
                    }
                }
            }
            return j6g.a;
        }
    }

    public static final class c extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ int $$default;
        final /* synthetic */ c20 $alignment;
        final /* synthetic */ boolean $applyOpacityToLayers;
        final /* synthetic */ boolean $applyShadowToLayers;
        final /* synthetic */ aw0 $asyncUpdates;
        final /* synthetic */ boolean $clipTextToBoundingBox;
        final /* synthetic */ boolean $clipToCompositionBounds;
        final /* synthetic */ s69 $composition;
        final /* synthetic */ ft2 $contentScale;
        final /* synthetic */ k79 $dynamicProperties;
        final /* synthetic */ boolean $enableMergePaths;
        final /* synthetic */ Map<String, Typeface> $fontMap;
        final /* synthetic */ boolean $maintainOriginalImageBounds;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ boolean $outlineMasksAndMattes;
        final /* synthetic */ gu5<Float> $progress;
        final /* synthetic */ s1d $renderMode;
        final /* synthetic */ boolean $safeMode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(s69 s69Var, gu5<Float> gu5Var, androidx.compose.ui.e eVar, boolean z, boolean z2, boolean z3, boolean z4, s1d s1dVar, boolean z5, k79 k79Var, c20 c20Var, ft2 ft2Var, boolean z6, boolean z7, Map<String, ? extends Typeface> map, aw0 aw0Var, boolean z8, int i, int i2, int i3) {
            super(2);
            this.$composition = s69Var;
            this.$progress = gu5Var;
            this.$modifier = eVar;
            this.$outlineMasksAndMattes = z;
            this.$applyOpacityToLayers = z2;
            this.$applyShadowToLayers = z3;
            this.$enableMergePaths = z4;
            this.$renderMode = s1dVar;
            this.$maintainOriginalImageBounds = z5;
            this.$dynamicProperties = k79Var;
            this.$alignment = c20Var;
            this.$contentScale = ft2Var;
            this.$clipToCompositionBounds = z6;
            this.$clipTextToBoundingBox = z7;
            this.$fontMap = map;
            this.$asyncUpdates = aw0Var;
            this.$safeMode = z8;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            n69.a(this.$composition, this.$progress, this.$modifier, this.$outlineMasksAndMattes, this.$applyOpacityToLayers, this.$applyShadowToLayers, this.$enableMergePaths, this.$renderMode, this.$maintainOriginalImageBounds, this.$dynamicProperties, this.$alignment, this.$contentScale, this.$clipToCompositionBounds, this.$clipTextToBoundingBox, this.$fontMap, this.$asyncUpdates, this.$safeMode, bVar, ka2.L(this.$$changed | 1), ka2.L(this.$$changed1), this.$$default);
            return j6g.a;
        }
    }

    public static final class d extends mj8 implements gu5<Float> {
        final /* synthetic */ p69 $progress$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(h69 h69Var) {
            super(0);
            this.$progress$delegate = h69Var;
        }

        @Override // defpackage.gu5
        public final Float invoke() {
            return Float.valueOf(this.$progress$delegate.getValue().floatValue());
        }
    }

    public static final class e extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ int $$changed2;
        final /* synthetic */ int $$default;
        final /* synthetic */ c20 $alignment;
        final /* synthetic */ boolean $applyOpacityToLayers;
        final /* synthetic */ boolean $applyShadowToLayers;
        final /* synthetic */ aw0 $asyncUpdates;
        final /* synthetic */ r69 $clipSpec;
        final /* synthetic */ boolean $clipTextToBoundingBox;
        final /* synthetic */ boolean $clipToCompositionBounds;
        final /* synthetic */ s69 $composition;
        final /* synthetic */ ft2 $contentScale;
        final /* synthetic */ k79 $dynamicProperties;
        final /* synthetic */ boolean $enableMergePaths;
        final /* synthetic */ Map<String, Typeface> $fontMap;
        final /* synthetic */ boolean $isPlaying;
        final /* synthetic */ int $iterations;
        final /* synthetic */ boolean $maintainOriginalImageBounds;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ boolean $outlineMasksAndMattes;
        final /* synthetic */ s1d $renderMode;
        final /* synthetic */ boolean $restartOnPlay;
        final /* synthetic */ boolean $reverseOnRepeat;
        final /* synthetic */ boolean $safeMode;
        final /* synthetic */ float $speed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(s69 s69Var, androidx.compose.ui.e eVar, boolean z, boolean z2, r69 r69Var, float f, int i, boolean z3, boolean z4, boolean z5, boolean z6, s1d s1dVar, boolean z7, boolean z8, k79 k79Var, c20 c20Var, ft2 ft2Var, boolean z9, boolean z10, Map<String, ? extends Typeface> map, boolean z11, aw0 aw0Var, int i2, int i3, int i4, int i5) {
            super(2);
            this.$composition = s69Var;
            this.$modifier = eVar;
            this.$isPlaying = z;
            this.$restartOnPlay = z2;
            this.$clipSpec = r69Var;
            this.$speed = f;
            this.$iterations = i;
            this.$outlineMasksAndMattes = z3;
            this.$applyOpacityToLayers = z4;
            this.$applyShadowToLayers = z5;
            this.$enableMergePaths = z6;
            this.$renderMode = s1dVar;
            this.$reverseOnRepeat = z7;
            this.$maintainOriginalImageBounds = z8;
            this.$dynamicProperties = k79Var;
            this.$alignment = c20Var;
            this.$contentScale = ft2Var;
            this.$clipToCompositionBounds = z9;
            this.$clipTextToBoundingBox = z10;
            this.$fontMap = map;
            this.$safeMode = z11;
            this.$asyncUpdates = aw0Var;
            this.$$changed = i2;
            this.$$changed1 = i3;
            this.$$changed2 = i4;
            this.$$default = i5;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            n69.b(this.$composition, this.$modifier, this.$isPlaying, this.$restartOnPlay, this.$clipSpec, this.$speed, this.$iterations, this.$outlineMasksAndMattes, this.$applyOpacityToLayers, this.$applyShadowToLayers, this.$enableMergePaths, this.$renderMode, this.$reverseOnRepeat, this.$maintainOriginalImageBounds, this.$dynamicProperties, this.$alignment, this.$contentScale, this.$clipToCompositionBounds, this.$clipTextToBoundingBox, this.$fontMap, this.$safeMode, this.$asyncUpdates, bVar, ka2.L(this.$$changed | 1), ka2.L(this.$$changed1), ka2.L(this.$$changed2), this.$$default);
            return j6g.a;
        }
    }

    public static final void a(s69 s69Var, gu5<Float> gu5Var, androidx.compose.ui.e eVar, boolean z, boolean z2, boolean z3, boolean z4, s1d s1dVar, boolean z5, k79 k79Var, c20 c20Var, ft2 ft2Var, boolean z6, boolean z7, Map<String, ? extends Typeface> map, aw0 aw0Var, boolean z8, androidx.compose.runtime.b bVar, int i, int i2, int i3) {
        gu5Var.getClass();
        androidx.compose.runtime.c cVarH = bVar.h(382909894);
        androidx.compose.ui.e eVar2 = (i3 & 4) != 0 ? e.a.b : eVar;
        boolean z9 = (i3 & 8) != 0 ? false : z;
        boolean z10 = (i3 & 16) != 0 ? false : z2;
        boolean z11 = (i3 & 32) != 0 ? true : z3;
        boolean z12 = (i3 & 64) != 0 ? false : z4;
        s1d s1dVar2 = (i3 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? s1d.a : s1dVar;
        boolean z13 = (i3 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? false : z5;
        k79 k79Var2 = (i3 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : k79Var;
        c20 c20Var2 = (i3 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? c20.a.e : c20Var;
        ft2 ft2Var2 = (i3 & 2048) != 0 ? ft2.a.b : ft2Var;
        boolean z14 = (i3 & 4096) != 0 ? true : z6;
        boolean z15 = (i3 & 8192) != 0 ? false : z7;
        Map<String, ? extends Typeface> map2 = (i3 & 16384) != 0 ? null : map;
        aw0 aw0Var2 = (32768 & i3) != 0 ? aw0.a : aw0Var;
        boolean z16 = (i3 & 65536) != 0 ? false : z8;
        cVarH.u(185152185);
        Object objV = cVarH.v();
        b.a.C0020a c0020a = b.a.a;
        if (objV == c0020a) {
            objV = new j79();
            cVarH.p(objV);
        }
        j79 j79Var = (j79) objV;
        cVarH.U(false);
        cVarH.u(185152232);
        Object objV2 = cVarH.v();
        if (objV2 == c0020a) {
            objV2 = new Matrix();
            cVarH.p(objV2);
        }
        Matrix matrix = (Matrix) objV2;
        cVarH.U(false);
        cVarH.u(185152312);
        boolean zK = cVarH.K(s69Var);
        Object objV3 = cVarH.v();
        if (zK || objV3 == c0020a) {
            objV3 = r.f(null);
            cVarH.p(objV3);
        }
        g4a g4aVar = (g4a) objV3;
        cVarH.U(false);
        cVarH.u(185152364);
        if (s69Var == null || s69Var.b() == 0.0f) {
            boolean z17 = z13;
            aw0 aw0Var3 = aw0Var2;
            boolean z18 = z12;
            s1d s1dVar3 = s1dVar2;
            c20 c20Var3 = c20Var2;
            boolean z19 = z10;
            boolean z20 = z15;
            k79 k79Var3 = k79Var2;
            ft2 ft2Var3 = ft2Var2;
            boolean z21 = z14;
            boolean z22 = z16;
            hl1.a(eVar2, cVarH, (i >> 6) & 14);
            cVarH.U(false);
            i iVarW = cVarH.W();
            if (iVarW != null) {
                iVarW.d = new a(s69Var, gu5Var, eVar2, z9, z19, z11, z18, s1dVar3, z17, k79Var3, c20Var3, ft2Var3, z21, z20, map2, aw0Var3, z22, i, i2, i3);
                return;
            }
            return;
        }
        cVarH.U(false);
        c20 c20Var4 = c20Var2;
        k79 k79Var4 = k79Var2;
        Rect rect = s69Var.k;
        Context context = (Context) cVarH.M(AndroidCompositionLocals_androidKt.b);
        int iWidth = rect.width();
        int iHeight = rect.height();
        eVar2.getClass();
        androidx.compose.ui.e eVarO = eVar2.o(new LottieAnimationSizeElement(iWidth, iHeight));
        ft2 ft2Var4 = ft2Var2;
        androidx.compose.ui.e eVar3 = eVar2;
        boolean z23 = z9;
        Map<String, ? extends Typeface> map3 = map2;
        boolean z24 = z11;
        boolean z25 = z12;
        s1d s1dVar4 = s1dVar2;
        aw0 aw0Var4 = aw0Var2;
        boolean z26 = z16;
        b bVar2 = new b(rect, ft2Var4, c20Var4, matrix, j79Var, z25, z26, s1dVar4, aw0Var4, s69Var, map3, k79Var4, z23, z10, z24, z13, z14, z15, context, gu5Var, g4aVar);
        boolean z27 = z13;
        boolean z28 = z10;
        boolean z29 = z14;
        boolean z30 = z15;
        w74.a(eVarO, bVar2, cVarH, 0);
        i iVarW2 = cVarH.W();
        if (iVarW2 != null) {
            iVarW2.d = new c(s69Var, gu5Var, eVar3, z23, z28, z24, z25, s1dVar4, z27, k79Var4, c20Var4, ft2Var4, z29, z30, map3, aw0Var4, z26, i, i2, i3);
        }
    }

    public static final void b(s69 s69Var, androidx.compose.ui.e eVar, boolean z, boolean z2, r69 r69Var, float f, int i, boolean z3, boolean z4, boolean z5, boolean z6, s1d s1dVar, boolean z7, boolean z8, k79 k79Var, c20 c20Var, ft2 ft2Var, boolean z9, boolean z10, Map<String, ? extends Typeface> map, boolean z11, aw0 aw0Var, androidx.compose.runtime.b bVar, int i2, int i3, int i4, int i5) {
        androidx.compose.runtime.c cVarH = bVar.h(1331239405);
        androidx.compose.ui.e eVar2 = (i5 & 2) != 0 ? e.a.b : eVar;
        boolean z12 = (i5 & 4) != 0 ? true : z;
        boolean z13 = (i5 & 8) != 0 ? true : z2;
        r69 r69Var2 = (i5 & 16) != 0 ? null : r69Var;
        float f2 = (i5 & 32) != 0 ? 1.0f : f;
        int i6 = (i5 & 64) != 0 ? 1 : i;
        boolean z14 = (i5 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? false : z3;
        boolean z15 = (i5 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? false : z4;
        boolean z16 = (i5 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? true : z5;
        boolean z17 = (i5 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? false : z6;
        s1d s1dVar2 = (i5 & 2048) != 0 ? s1d.a : s1dVar;
        boolean z18 = (i5 & 4096) != 0 ? false : z7;
        boolean z19 = (i5 & 8192) != 0 ? false : z8;
        k79 k79Var2 = (i5 & 16384) != 0 ? null : k79Var;
        c20 c20Var2 = (i5 & 32768) != 0 ? c20.a.e : c20Var;
        ft2 ft2Var2 = (i5 & 65536) != 0 ? ft2.a.b : ft2Var;
        boolean z20 = (i5 & 131072) != 0 ? true : z9;
        boolean z21 = (i5 & 262144) != 0 ? false : z10;
        Map<String, ? extends Typeface> map2 = (i5 & 524288) != 0 ? null : map;
        boolean z22 = (i5 & 1048576) != 0 ? false : z11;
        aw0 aw0Var2 = (i5 & 2097152) != 0 ? aw0.a : aw0Var;
        cVarH.u(683659508);
        if (i6 <= 0) {
            h5.k(bg.d(i6, "Iterations must be a positive number (", ")."));
            return;
        }
        if (Float.isInfinite(f2) || Float.isNaN(f2)) {
            throw new IllegalArgumentException(("Speed must be a finite number. It is " + f2 + ".").toString());
        }
        cVarH.u(2024497114);
        cVarH.u(-610207850);
        Object objV = cVarH.v();
        androidx.compose.ui.e eVar3 = eVar2;
        b.a.C0020a c0020a = b.a.a;
        if (objV == c0020a) {
            objV = new l69();
            cVarH.p(objV);
        }
        h69 h69Var = (h69) objV;
        cVarH.U(false);
        cVarH.U(false);
        cVarH.u(-180606964);
        Object objV2 = cVarH.v();
        if (objV2 == c0020a) {
            objV2 = r.f(Boolean.valueOf(z12));
            cVarH.p(objV2);
        }
        g4a g4aVar = (g4a) objV2;
        cVarH.U(false);
        cVarH.u(-180606834);
        Context context = (Context) cVarH.M(AndroidCompositionLocals_androidKt.b);
        Matrix matrix = ckg.a;
        boolean z23 = z12;
        s1d s1dVar3 = s1dVar2;
        float f3 = f2 / Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        cVarH.U(false);
        boolean z24 = z13;
        r69 r69Var3 = r69Var2;
        boolean z25 = z18;
        int i7 = i6;
        boolean z26 = z15;
        to4.g(new Object[]{s69Var, Boolean.valueOf(z23), r69Var2, Float.valueOf(f3), Integer.valueOf(i6)}, new yc0(z23, z24, h69Var, s69Var, i7, z25, f3, r69Var3, q69.a, false, g4aVar, null), cVarH);
        cVarH.U(false);
        cVarH.u(185157769);
        boolean zK = cVarH.K(h69Var);
        Object objV3 = cVarH.v();
        if (zK || objV3 == c0020a) {
            objV3 = new d(h69Var);
            cVarH.p(objV3);
        }
        cVarH.U(false);
        int i8 = i2 >> 12;
        int i9 = ((i2 << 3) & 896) | 1073741832 | (i8 & 7168) | (57344 & i8) | (i8 & 458752);
        int i10 = i3 << 18;
        int i11 = i9 | (i10 & 3670016) | (i10 & 29360128) | ((i3 << 15) & 234881024);
        int i12 = i3 >> 15;
        boolean z27 = z19;
        boolean z28 = z14;
        k79 k79Var3 = k79Var2;
        boolean z29 = z16;
        boolean z30 = z17;
        c20 c20Var3 = c20Var2;
        ft2 ft2Var3 = ft2Var2;
        boolean z31 = z20;
        boolean z32 = z21;
        Map<String, ? extends Typeface> map3 = map2;
        boolean z33 = z22;
        aw0 aw0Var3 = aw0Var2;
        a(s69Var, (gu5) objV3, eVar3, z28, z26, z29, z30, s1dVar3, z27, k79Var3, c20Var3, ft2Var3, z31, z32, map3, aw0Var3, z33, cVarH, i11, (i12 & 7168) | (i12 & 14) | 32768 | (i12 & 112) | (i12 & 896) | ((i4 << 12) & 458752) | ((i4 << 18) & 3670016), 0);
        float f4 = f2;
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new e(s69Var, eVar3, z23, z24, r69Var3, f4, i7, z28, z26, z29, z30, s1dVar3, z25, z27, k79Var3, c20Var3, ft2Var3, z31, z32, map3, z33, aw0Var3, i2, i3, i4, i5);
        }
    }
}
