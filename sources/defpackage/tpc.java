package defpackage;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityManager;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.uimanager.ViewGroupManager;
import com.indeed.android.jobsearch.R;
import defpackage.cj1;
import defpackage.fxa;
import defpackage.qeb;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0016\u0018\u0000 å\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0004æ\u0001ç\u0001B\u0011\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\fH\u0010¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0017¢\u0006\u0004\b\u001d\u0010\u000eJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0017¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u0010H\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u00020\f2\b\u0010&\u001a\u0004\u0018\u00010%H\u0007¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\f2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u00152\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00152\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b1\u00100J\u0017\u00102\u001a\u00020\u00152\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b2\u00100J\u0017\u00104\u001a\u00020\u00152\u0006\u00103\u001a\u00020-H\u0016¢\u0006\u0004\b4\u00100J\u000f\u00105\u001a\u00020\u0015H\u0016¢\u0006\u0004\b5\u00106J\u0015\u00108\u001a\u00020\f2\u0006\u00107\u001a\u00020\u0015¢\u0006\u0004\b8\u00109J\u001d\u0010=\u001a\u00020\f2\u0006\u0010:\u001a\u00020\u00102\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>J\u001f\u0010?\u001a\u00020\f2\u0006\u0010:\u001a\u00020\u00102\b\u0010\"\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b?\u0010@J\u0017\u0010B\u001a\u00020\f2\u0006\u0010A\u001a\u00020;H\u0007¢\u0006\u0004\bB\u0010CJ\u001f\u0010B\u001a\u00020\f2\u0006\u0010A\u001a\u00020;2\u0006\u0010:\u001a\u00020\u0010H\u0007¢\u0006\u0004\bB\u0010DJ\u001f\u0010B\u001a\u00020\f2\u0006\u0010F\u001a\u00020E2\b\u0010A\u001a\u0004\u0018\u00010G¢\u0006\u0004\bB\u0010HJ\u0017\u0010K\u001a\u00020\f2\b\u0010J\u001a\u0004\u0018\u00010I¢\u0006\u0004\bK\u0010LJ\u0017\u0010O\u001a\u00020\f2\u0006\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\fH\u0016¢\u0006\u0004\bQ\u0010\u000eJ\u001f\u0010Q\u001a\u00020\f2\u000e\u0010S\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010RH\u0016¢\u0006\u0004\bQ\u0010TJ\u0017\u0010W\u001a\u00020\f2\u0006\u0010V\u001a\u00020UH\u0016¢\u0006\u0004\bW\u0010XJ/\u0010]\u001a\u00020\f2\u0006\u0010Y\u001a\u00020\u00102\u0006\u0010Z\u001a\u00020\u00102\u0006\u0010[\u001a\u00020\u00102\u0006\u0010\\\u001a\u00020\u0010H\u0014¢\u0006\u0004\b]\u0010^J\u000f\u0010_\u001a\u00020\fH\u0014¢\u0006\u0004\b_\u0010\u000eJ\u0017\u0010a\u001a\u00020\f2\u0006\u0010`\u001a\u00020UH\u0016¢\u0006\u0004\ba\u0010XJ\u0017\u0010b\u001a\u00020\f2\u0006\u0010`\u001a\u00020UH\u0016¢\u0006\u0004\bb\u0010XJ\u001f\u0010e\u001a\u00020\u00102\u0006\u0010c\u001a\u00020\u00102\u0006\u0010d\u001a\u00020\u0010H\u0014¢\u0006\u0004\be\u0010fJ\u0017\u0010g\u001a\u00020\u00102\u0006\u0010d\u001a\u00020\u0010H\u0016¢\u0006\u0004\bg\u0010hJ\u000f\u0010i\u001a\u00020\fH\u0016¢\u0006\u0004\bi\u0010\u000eJ\u0017\u0010k\u001a\u00020\f2\u0006\u0010j\u001a\u00020\u0015H\u0014¢\u0006\u0004\bk\u00109J\u0019\u0010n\u001a\u0004\u0018\u00010U2\u0006\u0010d\u001a\u00020\u0010H\u0000¢\u0006\u0004\bl\u0010mJ\u001f\u0010q\u001a\u00020\f2\u0006\u0010`\u001a\u00020U2\u0006\u0010d\u001a\u00020\u0010H\u0000¢\u0006\u0004\bo\u0010pJ\u0017\u0010s\u001a\u00020\f2\u0006\u0010V\u001a\u00020UH\u0000¢\u0006\u0004\br\u0010XJ\u000f\u0010u\u001a\u00020\fH\u0000¢\u0006\u0004\bt\u0010\u000eJ/\u0010v\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0010H\u0016¢\u0006\u0004\bv\u0010^J\u0017\u0010y\u001a\u00020\f2\u0006\u0010x\u001a\u00020wH\u0016¢\u0006\u0004\by\u0010zJ\u0017\u0010{\u001a\u00020\f2\u0006\u0010x\u001a\u00020wH\u0014¢\u0006\u0004\b{\u0010zJ'\u0010~\u001a\u00020\u00152\u0006\u0010x\u001a\u00020w2\u0006\u0010`\u001a\u00020U2\u0006\u0010}\u001a\u00020|H\u0014¢\u0006\u0004\b~\u0010\u007fJ\u0018\u0010\u0081\u0001\u001a\u00020\f2\u0007\u0010\u0080\u0001\u001a\u00020;¢\u0006\u0005\b\u0081\u0001\u0010CJ\u0018\u0010\u0083\u0001\u001a\u00020\f2\u0007\u0010\u0082\u0001\u001a\u00020I¢\u0006\u0005\b\u0083\u0001\u0010LJ\u000f\u0010\u0084\u0001\u001a\u00020\f¢\u0006\u0005\b\u0084\u0001\u0010\u000eJ\"\u0010\u0087\u0001\u001a\u00020\f2\u000e\u0010\u0086\u0001\u001a\t\u0012\u0004\u0012\u00020U0\u0085\u0001H\u0016¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u000f\u0010\u0089\u0001\u001a\u00020\f¢\u0006\u0005\b\u0089\u0001\u0010\u000eJ\u0011\u0010\u008a\u0001\u001a\u00020\fH\u0002¢\u0006\u0005\b\u008a\u0001\u0010\u000eJ\u001a\u0010\u008c\u0001\u001a\u00020\f2\u0007\u0010\u008b\u0001\u001a\u00020\u0010H\u0002¢\u0006\u0005\b\u008c\u0001\u0010$J\u001a\u0010\u008d\u0001\u001a\u00020\u00152\u0006\u0010`\u001a\u00020UH\u0002¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J.\u0010\u0091\u0001\u001a\u00020\f2\u0007\u0010\u008f\u0001\u001a\u00020M2\u0011\b\u0002\u0010\u0090\u0001\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010RH\u0002¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J@\u0010\u0095\u0001\u001a\u00020\f2\u0007\u0010\u008f\u0001\u001a\u00020M2\u0007\u0010\u0093\u0001\u001a\u00020\u00102\u0007\u0010\u0094\u0001\u001a\u00020\u00102\u0011\b\u0002\u0010\u0090\u0001\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010RH\u0002¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u001a\u0010\u0095\u0001\u001a\u00020\f2\u0007\u0010\u0097\u0001\u001a\u00020UH\u0002¢\u0006\u0005\b\u0095\u0001\u0010XJ\u0011\u0010\u0098\u0001\u001a\u00020\u0015H\u0002¢\u0006\u0005\b\u0098\u0001\u00106J#\u0010\u009a\u0001\u001a\u00020\f2\u0006\u0010`\u001a\u00020U2\u0007\u0010\u0099\u0001\u001a\u00020\u0015H\u0002¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u0011\u0010\u009c\u0001\u001a\u00020\fH\u0002¢\u0006\u0005\b\u009c\u0001\u0010\u000eJ&\u0010\u009d\u0001\u001a\u00020\u00152\b\u0010V\u001a\u0004\u0018\u00010U2\b\u0010d\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u001a\u0010\u009f\u0001\u001a\u00020\u00102\u0006\u0010`\u001a\u00020UH\u0002¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J!\u0010¡\u0001\u001a\u00020\f2\u0006\u0010`\u001a\u00020U2\u0006\u0010d\u001a\u00020\u0010H\u0002¢\u0006\u0005\b¡\u0001\u0010pJ\u0019\u0010¢\u0001\u001a\u00020\f2\u0006\u0010d\u001a\u00020\u0010H\u0002¢\u0006\u0005\b¢\u0001\u0010$J\u001c\u0010¤\u0001\u001a\u00020\f2\t\u0010£\u0001\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0005\b¤\u0001\u0010(R\u001f\u0010¥\u0001\u001a\u00020M8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¥\u0001\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001R\u0019\u0010©\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u0019\u0010«\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u0019\u0010\u00ad\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0001\u0010¬\u0001R$\u0010¯\u0001\u001a\r\u0012\u0006\u0012\u0004\u0018\u00010U\u0018\u00010®\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R*\u0010²\u0001\u001a\u00020\u00102\u0007\u0010±\u0001\u001a\u00020\u00108\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b²\u0001\u0010ª\u0001\u001a\u0006\b³\u0001\u0010´\u0001R\u001b\u0010\u008f\u0001\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010¦\u0001R*\u0010µ\u0001\u001a\u0004\u0018\u00010M8\u0016@\u0016X\u0096\u000e¢\u0006\u0017\n\u0006\bµ\u0001\u0010¦\u0001\u001a\u0006\b¶\u0001\u0010¨\u0001\"\u0005\b·\u0001\u0010PR*\u0010¹\u0001\u001a\u00030¸\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b¹\u0001\u0010º\u0001\u001a\u0006\b»\u0001\u0010¼\u0001\"\u0006\b½\u0001\u0010¾\u0001R2\u0010À\u0001\u001a\u000b\u0012\u0004\u0012\u00020I\u0018\u00010¿\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÀ\u0001\u0010Á\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001\"\u0006\bÄ\u0001\u0010Å\u0001R\u001c\u0010Ç\u0001\u001a\u0005\u0018\u00010Æ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÇ\u0001\u0010È\u0001R\u001b\u0010É\u0001\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÉ\u0001\u0010Ê\u0001R\u0017\u00107\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b7\u0010¬\u0001R\u0019\u0010Ë\u0001\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bË\u0001\u0010Ì\u0001R\u0019\u0010Í\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÍ\u0001\u0010¬\u0001R\"\u0010Ï\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010Î\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÏ\u0001\u0010Ð\u0001R\u001c\u0010Ò\u0001\u001a\u0005\u0018\u00010Ñ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÒ\u0001\u0010Ó\u0001R\u001c\u0010Õ\u0001\u001a\u0005\u0018\u00010Ô\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÕ\u0001\u0010Ö\u0001R\u001c\u0010Ø\u0001\u001a\u0005\u0018\u00010×\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bØ\u0001\u0010Ù\u0001R(\u0010Ý\u0001\u001a\u00020\u00152\u0007\u0010Ú\u0001\u001a\u00020\u00158V@VX\u0096\u000e¢\u0006\u000e\u001a\u0005\bÛ\u0001\u00106\"\u0005\bÜ\u0001\u00109R-\u0010Þ\u0001\u001a\u0004\u0018\u00010I2\t\u0010Þ\u0001\u001a\u0004\u0018\u00010I8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0006\bß\u0001\u0010à\u0001\"\u0005\bá\u0001\u0010LR\u0018\u0010ä\u0001\u001a\u00030Ô\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bâ\u0001\u0010ã\u0001¨\u0006è\u0001"}, d2 = {"Ltpc;", "Landroid/view/ViewGroup;", "Ljmc;", "Lwjc;", "Lrnc;", "Lpkc;", "Lzpc;", "Lhnc;", "Landroid/content/Context;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "<init>", "(Landroid/content/Context;)V", "Lj6g;", "recycleView$ReactAndroid_release", "()V", "recycleView", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "changed", GesturesListener.SCROLL_DIRECTION_LEFT, "top", GesturesListener.SCROLL_DIRECTION_RIGHT, "bottom", "onLayout", "(ZIIII)V", "requestLayout", "Landroid/view/ViewStructure;", "structure", "dispatchProvideStructure", "(Landroid/view/ViewStructure;)V", "color", "setBackgroundColor", "(I)V", "Landroid/graphics/drawable/Drawable;", "background", "setTranslucentBackgroundDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Loqa;", "listener", "setOnInterceptTouchEventListener", "(Loqa;)V", "Landroid/view/MotionEvent;", "event", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "onTouchEvent", "onHoverEvent", "ev", "dispatchGenericMotionEvent", "hasOverlappingRendering", "()Z", "needsOffscreenAlphaCompositing", "setNeedsOffscreenAlphaCompositing", "(Z)V", "position", "", "width", "setBorderWidth", "(IF)V", "setBorderColor", "(ILjava/lang/Integer;)V", "borderRadius", "setBorderRadius", "(F)V", "(FI)V", "Lzi1;", "property", "Lou8;", "(Lzi1;Lou8;)V", "", "style", "setBorderStyle", "(Ljava/lang/String;)V", "Landroid/graphics/Rect;", "outClippingRect", "getClippingRect", "(Landroid/graphics/Rect;)V", "updateClippingRect", "", "excludedViews", "(Ljava/util/Set;)V", "Landroid/view/View;", "view", "endViewTransition", "(Landroid/view/View;)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "onAttachedToWindow", "child", "onViewAdded", "onViewRemoved", "childCount", "index", "getChildDrawingOrder", "(II)I", "getZIndexMappedChildIndex", "(I)I", "updateDrawingOrder", "pressed", "dispatchSetPressed", "getChildAtWithSubviewClippingEnabled$ReactAndroid_release", "(I)Landroid/view/View;", "getChildAtWithSubviewClippingEnabled", "addViewWithSubviewClippingEnabled$ReactAndroid_release", "(Landroid/view/View;I)V", "addViewWithSubviewClippingEnabled", "removeViewWithSubviewClippingEnabled$ReactAndroid_release", "removeViewWithSubviewClippingEnabled", "removeAllViewsWithSubviewClippingEnabled$ReactAndroid_release", "removeAllViewsWithSubviewClippingEnabled", "setOverflowInset", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "dispatchDraw", "", "drawingTime", "drawChild", "(Landroid/graphics/Canvas;Landroid/view/View;J)Z", "opacity", "setOpacityIfPossible", "backfaceVisibility", "setBackfaceVisibility", "setBackfaceVisibilityDependantOpacity", "Ljava/util/ArrayList;", "outChildren", "addChildrenForAccessibility", "(Ljava/util/ArrayList;)V", "cleanUpAxOrderListener", "initView", "childId", "trackChildViewTransition", "isChildRemovedWhileTransitioning", "(Landroid/view/View;)Z", "clippingRect", "excludedViewsSet", "updateClippingToRect", "(Landroid/graphics/Rect;Ljava/util/Set;)V", "idx", "clippedSoFar", "updateSubviewClipStatus", "(Landroid/graphics/Rect;IILjava/util/Set;)V", "subview", "customDrawOrderDisabled", "expectedTag", "checkViewClippingTag", "(Landroid/view/View;Z)V", "resetPointerEvents", "isViewClipped", "(Landroid/view/View;Ljava/lang/Integer;)Z", "indexOfChildInAllChildren", "(Landroid/view/View;)I", "addInArray", "removeFromArray", "drawable", "updateBackgroundDrawable", "overflowInset", "Landroid/graphics/Rect;", "getOverflowInset", "()Landroid/graphics/Rect;", "recycleCount", "I", "_removeClippedSubviews", "Z", "inSubviewClippingLoop", "", "allChildren", "[Landroid/view/View;", "value", "allChildrenCount", "getAllChildrenCount$ReactAndroid_release", "()I", "hitSlopRect", "getHitSlopRect", "setHitSlopRect", "Lqeb;", "pointerEvents", "Lqeb;", "getPointerEvents", "()Lqeb;", "setPointerEvents", "(Lqeb;)V", "", "axOrderList", "Ljava/util/List;", "getAxOrderList", "()Ljava/util/List;", "setAxOrderList", "(Ljava/util/List;)V", "Ltpc$a;", "childrenLayoutChangeListener", "Ltpc$a;", "onInterceptTouchEventListener", "Loqa;", "backfaceOpacity", "F", "backfaceVisible", "", "childrenRemovedWhileTransitioning", "Ljava/util/Set;", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "accessibilityStateChangeListener", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "Lcom/facebook/react/uimanager/c;", "_drawingOrderHelper", "Lcom/facebook/react/uimanager/c;", "Lfxa;", "_overflow", "Lfxa;", "newValue", "getRemoveClippedSubviews", "setRemoveClippedSubviews", "removeClippedSubviews", "overflow", "getOverflow", "()Ljava/lang/String;", "setOverflow", "getDrawingOrderHelper", "()Lcom/facebook/react/uimanager/c;", "drawingOrderHelper", "Companion", "a", "b", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class tpc extends ViewGroup implements jmc, wjc, rnc, pkc, zpc, hnc {
    private static final int ARRAY_CAPACITY_INCREMENT = 12;
    private static final b Companion = new b();
    private static final ViewGroup.LayoutParams defaultLayoutParam = new ViewGroup.LayoutParams(0, 0);
    private com.facebook.react.uimanager.c _drawingOrderHelper;
    private fxa _overflow;
    private boolean _removeClippedSubviews;
    private AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener;
    private View[] allChildren;
    private int allChildrenCount;
    private List<String> axOrderList;
    private float backfaceOpacity;
    private boolean backfaceVisible;
    private a childrenLayoutChangeListener;
    private Set<Integer> childrenRemovedWhileTransitioning;
    private Rect clippingRect;
    private Rect hitSlopRect;
    private volatile boolean inSubviewClippingLoop;
    private boolean needsOffscreenAlphaCompositing;
    private oqa onInterceptTouchEventListener;
    private final Rect overflowInset;
    private qeb pointerEvents;
    private int recycleCount;

    public static final class a implements View.OnLayoutChangeListener {
        public tpc a;

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            tpc tpcVar;
            view.getClass();
            tpc tpcVar2 = this.a;
            if (tpcVar2 == null || !tpcVar2.get_removeClippedSubviews() || (tpcVar = this.a) == null) {
                return;
            }
            tpcVar.updateSubviewClipStatus(view);
        }
    }

    public static final class b {
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[fxa.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public tpc(Context context) {
        super(context);
        this.overflowInset = new Rect();
        this.pointerEvents = qeb.e;
        initView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addChildrenForAccessibility$lambda$1(tpc tpcVar, boolean z) {
        if (z) {
            return;
        }
        tpcVar.getClass();
        int childCount = tpcVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = tpcVar.getChildAt(i);
            childAt.getClass();
            c0h.O(childAt);
        }
    }

    private final void addInArray(View child, int index) {
        View[] viewArr = this.allChildren;
        if (viewArr == null) {
            r6.g("Required value was null.");
            return;
        }
        int i = this.allChildrenCount;
        int length = viewArr.length;
        if (index == i) {
            if (length == i) {
                View[] viewArr2 = new View[length + ARRAY_CAPACITY_INCREMENT];
                System.arraycopy(viewArr, 0, viewArr2, 0, length);
                this.allChildren = viewArr2;
                viewArr = viewArr2;
            }
            int i2 = this.allChildrenCount;
            this.allChildrenCount = i2 + 1;
            viewArr[i2] = child;
            return;
        }
        if (index >= i) {
            l5.s(k20.l("index=", index, i, " count="));
            return;
        }
        if (length == i) {
            View[] viewArr3 = new View[length + ARRAY_CAPACITY_INCREMENT];
            System.arraycopy(viewArr, 0, viewArr3, 0, index);
            System.arraycopy(viewArr, index, viewArr3, index + 1, i - index);
            this.allChildren = viewArr3;
            viewArr = viewArr3;
        } else {
            System.arraycopy(viewArr, index, viewArr, index + 1, i - index);
        }
        viewArr[index] = child;
        this.allChildrenCount++;
    }

    private final void checkViewClippingTag(View child, boolean expectedTag) {
        if (this.inSubviewClippingLoop) {
            Object tag = child.getTag(R.id.view_clipped);
            if (!Boolean.valueOf(expectedTag).equals(tag)) {
                ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.RVG_ON_VIEW_REMOVED, new ReactNoCrashSoftException("View clipping tag mismatch: tag=" + tag + " expected=" + expectedTag));
            }
        }
        if (this._removeClippedSubviews) {
            child.setTag(R.id.view_clipped, Boolean.valueOf(expectedTag));
        } else {
            child.setTag(R.id.view_clipped, null);
        }
    }

    private final boolean customDrawOrderDisabled() {
        return getId() != -1 && msb.e(getId()) == 2;
    }

    private final com.facebook.react.uimanager.c getDrawingOrderHelper() {
        if (this._drawingOrderHelper == null) {
            this._drawingOrderHelper = new com.facebook.react.uimanager.c(this);
        }
        com.facebook.react.uimanager.c cVar = this._drawingOrderHelper;
        if (cVar != null) {
            return cVar;
        }
        l5.q("Required value was null.");
        return null;
    }

    private final int indexOfChildInAllChildren(View child) {
        int i = this.allChildrenCount;
        View[] viewArr = this.allChildren;
        if (viewArr == null) {
            r6.g("Required value was null.");
            return 0;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (viewArr[i2] == child) {
                return i2;
            }
        }
        return -1;
    }

    private final void initView() {
        setClipChildren(false);
        this._removeClippedSubviews = false;
        this.inSubviewClippingLoop = false;
        this.allChildren = null;
        this.allChildrenCount = 0;
        this.clippingRect = null;
        setHitSlopRect(null);
        this._overflow = fxa.b;
        setPointerEvents(qeb.e);
        this.childrenLayoutChangeListener = null;
        this.onInterceptTouchEventListener = null;
        this.needsOffscreenAlphaCompositing = false;
        this._drawingOrderHelper = null;
        this.backfaceOpacity = 1.0f;
        this.backfaceVisible = true;
        this.childrenRemovedWhileTransitioning = null;
    }

    private final boolean isChildRemovedWhileTransitioning(View child) {
        Set<Integer> set = this.childrenRemovedWhileTransitioning;
        return set != null && set.contains(Integer.valueOf(child.getId()));
    }

    private final boolean isViewClipped(View view, Integer index) {
        if (view == null) {
            r6.g("Required value was null.");
            return false;
        }
        Object tag = view.getTag(R.id.view_clipped);
        if (tag != null) {
            return ((Boolean) tag).booleanValue();
        }
        ViewParent parent = view.getParent();
        boolean zIsChildRemovedWhileTransitioning = isChildRemovedWhileTransitioning(view);
        if (index != null) {
            ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.RVG_IS_VIEW_CLIPPED, new ReactNoCrashSoftException("View missing clipping tag: index=" + index + " parentNull=" + (parent == null) + " parentThis=" + (parent == this) + " transitioning=" + zIsChildRemovedWhileTransitioning));
        }
        if (parent == null || zIsChildRemovedWhileTransitioning) {
            return true;
        }
        if (parent == this) {
            return false;
        }
        r6.g("Check failed.");
        return false;
    }

    private final void removeFromArray(int index) {
        View[] viewArr = this.allChildren;
        if (viewArr == null) {
            r6.g("Required value was null.");
            return;
        }
        int i = this.allChildrenCount;
        if (index == i - 1) {
            int i2 = i - 1;
            this.allChildrenCount = i2;
            viewArr[i2] = null;
        } else {
            if (index < 0 || index >= i) {
                k20.o();
                return;
            }
            System.arraycopy(viewArr, index + 1, viewArr, index, (i - index) - 1);
            int i3 = this.allChildrenCount - 1;
            this.allChildrenCount = i3;
            viewArr[i3] = null;
        }
    }

    private final void resetPointerEvents() {
        setPointerEvents(qeb.e);
    }

    private final void trackChildViewTransition(int childId) {
        if (this.childrenRemovedWhileTransitioning == null) {
            this.childrenRemovedWhileTransitioning = new LinkedHashSet();
        }
        Set<Integer> set = this.childrenRemovedWhileTransitioning;
        if (set != null) {
            set.add(Integer.valueOf(childId));
        }
    }

    private final void updateBackgroundDrawable(Drawable drawable) {
        super.setBackground(drawable);
    }

    private final void updateClippingToRect(Rect clippingRect, Set<Integer> excludedViewsSet) {
        View[] viewArr = this.allChildren;
        if (viewArr == null) {
            r6.g("Required value was null.");
            return;
        }
        this.inSubviewClippingLoop = true;
        int i = this.allChildrenCount;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            try {
                updateSubviewClipStatus(clippingRect, i3, i2, excludedViewsSet);
                if (isViewClipped(viewArr[i3], Integer.valueOf(i3))) {
                    i2++;
                }
                if (i3 - i2 > getChildCount()) {
                    int childCount = getChildCount();
                    int i4 = this.allChildrenCount;
                    int i5 = this.recycleCount;
                    int size = excludedViewsSet != null ? excludedViewsSet.size() : 0;
                    StringBuilder sbF = uz.f("Invalid clipping state. i=", i3, " clippedSoFar=", i2, " count=");
                    uz.i(sbF, childCount, " allChildrenCount=", i4, " recycleCount=");
                    sbF.append(i5);
                    sbF.append("  excludedViews=");
                    sbF.append(size);
                    throw new IllegalStateException(sbF.toString());
                }
            } catch (IndexOutOfBoundsException e) {
                HashSet hashSet = new HashSet();
                int i6 = 0;
                for (int i7 = 0; i7 < i3; i7++) {
                    i6 += isViewClipped(viewArr[i7], Integer.valueOf(i7)) ? 1 : 0;
                    hashSet.add(viewArr[i7]);
                }
                int childCount2 = getChildCount();
                int i8 = this.allChildrenCount;
                int i9 = this.recycleCount;
                int size2 = hashSet.size();
                int size3 = excludedViewsSet != null ? excludedViewsSet.size() : 0;
                StringBuilder sbF2 = uz.f("Invalid clipping state. i=", i3, " clippedSoFar=", i2, " count=");
                uz.i(sbF2, childCount2, " allChildrenCount=", i8, " recycleCount=");
                uz.i(sbF2, i9, " realClippedSoFar=", i6, " uniqueViewsCount=");
                sbF2.append(size2);
                sbF2.append(" excludedViews=");
                sbF2.append(size3);
                throw new IllegalStateException(sbF2.toString(), e);
            }
        }
        this.inSubviewClippingLoop = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateClippingToRect$default(tpc tpcVar, Rect rect, Set set, int i, Object obj) {
        if (obj != null) {
            b0.u("Super calls with default arguments not supported in this target, function: updateClippingToRect");
            return;
        }
        if ((i & 2) != 0) {
            set = null;
        }
        tpcVar.updateClippingToRect(rect, set);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void updateSubviewClipStatus(android.graphics.Rect r10, int r11, int r12, java.util.Set<java.lang.Integer> r13) {
        /*
            r9 = this;
            com.facebook.react.bridge.UiThreadUtil.assertOnUiThread()
            android.view.View[] r0 = r9.allChildren
            r1 = 0
            if (r0 == 0) goto Lb
            r0 = r0[r11]
            goto Lc
        Lb:
            r0 = r1
        Lc:
            if (r0 == 0) goto Lba
            int r2 = r0.getLeft()
            int r3 = r0.getTop()
            int r4 = r0.getRight()
            int r5 = r0.getBottom()
            boolean r10 = r10.intersects(r2, r3, r4, r5)
            android.view.animation.Animation r2 = r0.getAnimation()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            boolean r2 = r2.hasEnded()
            if (r2 != 0) goto L32
            r2 = r4
            goto L33
        L32:
            r2 = r3
        L33:
            if (r13 == 0) goto L45
            int r5 = r0.getId()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            boolean r5 = r13.contains(r5)
            if (r5 != r4) goto L45
            r5 = r4
            goto L46
        L45:
            r5 = r3
        L46:
            if (r13 == 0) goto L4a
            r6 = r4
            goto L4b
        L4a:
            r6 = r3
        L4b:
            r7 = 2131362690(0x7f0a0382, float:1.8345168E38)
            if (r10 != 0) goto L73
            java.lang.Integer r8 = java.lang.Integer.valueOf(r11)
            boolean r8 = r9.isViewClipped(r0, r8)
            if (r8 != 0) goto L73
            if (r2 != 0) goto L73
            android.view.View r2 = r9.getFocusedChild()
            if (r0 == r2) goto L73
            if (r5 != 0) goto L73
            tpc$b r10 = defpackage.tpc.Companion
            r10.getClass()
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            r0.setTag(r7, r10)
            r9.removeViewInLayout(r0)
        L71:
            r6 = r4
            goto La0
        L73:
            if (r5 != 0) goto L77
            if (r10 == 0) goto L9d
        L77:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            boolean r2 = r9.isViewClipped(r0, r2)
            if (r2 == 0) goto L9d
            int r11 = r11 - r12
            if (r11 < 0) goto L97
            tpc$b r10 = defpackage.tpc.Companion
            r10.getClass()
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r0.setTag(r7, r10)
            android.view.ViewGroup$LayoutParams r10 = defpackage.tpc.defaultLayoutParam
            r9.addViewInLayout(r0, r11, r10, r4)
            r9.invalidate()
            goto L71
        L97:
            java.lang.String r9 = "Check failed."
            defpackage.r6.g(r9)
            return
        L9d:
            if (r10 == 0) goto La0
            goto L71
        La0:
            if (r6 == 0) goto Lb9
            boolean r9 = r0 instanceof defpackage.wjc
            if (r9 == 0) goto La9
            r1 = r0
            wjc r1 = (defpackage.wjc) r1
        La9:
            if (r1 == 0) goto Lb2
            boolean r9 = r1.get_removeClippedSubviews()
            if (r9 != r4) goto Lb2
            r3 = r4
        Lb2:
            if (r3 == 0) goto Lb9
            wjc r0 = (defpackage.wjc) r0
            r0.updateClippingRect(r13)
        Lb9:
            return
        Lba:
            java.lang.String r9 = "Required value was null."
            defpackage.r6.g(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tpc.updateSubviewClipStatus(android.graphics.Rect, int, int, java.util.Set):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateSubviewClipStatus$default(tpc tpcVar, Rect rect, int i, int i2, Set set, int i3, Object obj) {
        if (obj != null) {
            b0.u("Super calls with default arguments not supported in this target, function: updateSubviewClipStatus");
            return;
        }
        if ((i3 & 8) != 0) {
            set = null;
        }
        tpcVar.updateSubviewClipStatus(rect, i, i2, set);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addChildrenForAccessibility(ArrayList<View> outChildren) {
        outChildren.getClass();
        tpc tpcVar = (tpc) getTag(R.id.accessibility_order_parent);
        List<String> list = tpcVar != null ? tpcVar.axOrderList : null;
        List<String> list2 = this.axOrderList;
        int i = 0;
        if (list2 == null) {
            if (list == null) {
                super.addChildrenForAccessibility(outChildren);
                return;
            }
            if (!isFocusable()) {
                super.addChildrenForAccessibility(outChildren);
                return;
            }
            if (!isFocusable() || (getContentDescription() != null && !wl7.b(getContentDescription(), ""))) {
                if (!isFocusable() || getContentDescription() == null) {
                    return;
                }
                wl7.b(getContentDescription(), "");
                return;
            }
            super.addChildrenForAccessibility(outChildren);
            int childCount = getChildCount();
            while (i < childCount) {
                View childAt = getChildAt(i);
                childAt.getClass();
                c0h.v(childAt, list);
                i++;
            }
            return;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        if (this.accessibilityStateChangeListener == null && accessibilityManager != null) {
            AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: spc
                @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
                public final void onAccessibilityStateChanged(boolean z) {
                    tpc.addChildrenForAccessibility$lambda$1(this.a, z);
                }
            };
            accessibilityManager.addAccessibilityStateChangeListener(accessibilityStateChangeListener);
            this.accessibilityStateChangeListener = accessibilityStateChangeListener;
        }
        int size = list2.size();
        View[] viewArr = new View[size];
        int childCount2 = getChildCount();
        for (int i2 = 0; i2 < childCount2; i2++) {
            c0h c0hVar = c0h.i0;
            View childAt2 = getChildAt(i2);
            childAt2.getClass();
            c0hVar.l(childAt2, list2, viewArr);
        }
        while (i < size) {
            View view = viewArr[i];
            if (view != null) {
                if (view.isFocusable()) {
                    outChildren.add(view);
                } else {
                    view.addChildrenForAccessibility(outChildren);
                }
            }
            i++;
        }
    }

    public final void addViewWithSubviewClippingEnabled$ReactAndroid_release(View child, int index) {
        child.getClass();
        if (!this._removeClippedSubviews) {
            r6.g("Check failed.");
            return;
        }
        Companion.getClass();
        child.setTag(R.id.view_clipped, Boolean.TRUE);
        addInArray(child, index);
        Rect rect = this.clippingRect;
        if (rect == null) {
            r6.g("Required value was null.");
            return;
        }
        View[] viewArr = this.allChildren;
        if (viewArr == null) {
            r6.g("Required value was null.");
            return;
        }
        this.inSubviewClippingLoop = true;
        int i = 0;
        for (int i2 = 0; i2 < index; i2++) {
            if (isViewClipped(viewArr[i2], Integer.valueOf(i2))) {
                i++;
            }
        }
        updateSubviewClipStatus$default(this, rect, index, i, null, 8, null);
        this.inSubviewClippingLoop = false;
        child.addOnLayoutChangeListener(this.childrenLayoutChangeListener);
    }

    public final void cleanUpAxOrderListener() {
        AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener;
        Object systemService = getContext().getSystemService("accessibility");
        AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
        if (accessibilityManager != null && (accessibilityStateChangeListener = this.accessibilityStateChangeListener) != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(accessibilityStateChangeListener);
        }
        this.accessibilityStateChangeListener = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        if (this._overflow != fxa.b || getTag(R.id.filter) != null) {
            v71.a(this, canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent ev) {
        ev.getClass();
        qeb pointerEvents = getPointerEvents();
        qeb.a.getClass();
        if (qeb.a.b(pointerEvents)) {
            return super.dispatchGenericMotionEvent(ev);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(23)
    public void dispatchProvideStructure(ViewStructure structure) {
        structure.getClass();
        try {
            super.dispatchProvideStructure(structure);
        } catch (NullPointerException e) {
            s55.g("ReactNative", "NullPointerException when executing dispatchProvideStructure", e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSetPressed(boolean pressed) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.getClass();
        if (Build.VERSION.SDK_INT < 29 || msb.e(getId()) != 2 || !nh1.a(this)) {
            super.draw(canvas);
            return;
        }
        Rect overflowInset = getOverflowInset();
        canvas.saveLayer(overflowInset.left, overflowInset.top, getWidth() + (-overflowInset.right), getHeight() + (-overflowInset.bottom), null);
        super.draw(canvas);
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006b A[PHI: r4
  0x006b: PHI (r4v1 android.graphics.BlendMode) = 
  (r4v0 android.graphics.BlendMode)
  (r4v0 android.graphics.BlendMode)
  (r4v0 android.graphics.BlendMode)
  (r4v3 android.graphics.BlendMode)
 binds: [B:9:0x001e, B:11:0x0029, B:13:0x002f, B:17:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean drawChild(android.graphics.Canvas r12, android.view.View r13, long r14) {
        /*
            r11 = this;
            r12.getClass()
            r13.getClass()
            float r0 = r13.getElevation()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L13
            r0 = r2
            goto L14
        L13:
            r0 = r1
        L14:
            if (r0 == 0) goto L19
            defpackage.dx1.a(r12, r2)
        L19:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            r4 = 0
            if (r2 < r3) goto L6b
            int r2 = r11.getId()
            int r2 = defpackage.msb.e(r2)
            r3 = 2
            if (r2 != r3) goto L6b
            boolean r2 = defpackage.nh1.a(r11)
            if (r2 == 0) goto L6b
            r2 = 2131362330(0x7f0a021a, float:1.8344438E38)
            java.lang.Object r2 = r13.getTag(r2)
            boolean r3 = r2 instanceof android.graphics.BlendMode
            if (r3 == 0) goto L40
            android.graphics.BlendMode r4 = defpackage.w20.j(r2)
        L40:
            if (r4 == 0) goto L6b
            android.graphics.Paint r10 = new android.graphics.Paint
            r10.<init>()
            r10.setBlendMode(r4)
            android.graphics.Rect r2 = r11.getOverflowInset()
            int r3 = r2.left
            float r6 = (float) r3
            int r3 = r2.top
            float r7 = (float) r3
            int r3 = r11.getWidth()
            int r5 = r2.right
            int r5 = -r5
            int r3 = r3 + r5
            float r8 = (float) r3
            int r3 = r11.getHeight()
            int r2 = r2.bottom
            int r2 = -r2
            int r3 = r3 + r2
            float r9 = (float) r3
            r5 = r12
            r5.saveLayer(r6, r7, r8, r9, r10)
            goto L6c
        L6b:
            r5 = r12
        L6c:
            boolean r11 = super.drawChild(r5, r13, r14)
            if (r4 == 0) goto L75
            r5.restore()
        L75:
            if (r0 == 0) goto L7a
            defpackage.dx1.a(r5, r1)
        L7a:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tpc.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        view.getClass();
        super.endViewTransition(view);
        Set<Integer> set = this.childrenRemovedWhileTransitioning;
        if (set != null) {
            set.remove(Integer.valueOf(view.getId()));
        }
    }

    /* JADX INFO: renamed from: getAllChildrenCount$ReactAndroid_release, reason: from getter */
    public final int getAllChildrenCount() {
        return this.allChildrenCount;
    }

    public final List<String> getAxOrderList() {
        return this.axOrderList;
    }

    public final View getChildAtWithSubviewClippingEnabled$ReactAndroid_release(int index) {
        if (index >= 0 && index < this.allChildrenCount) {
            View[] viewArr = this.allChildren;
            if (viewArr != null) {
                return viewArr[index];
            }
            r6.g("Required value was null.");
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int childCount, int index) {
        UiThreadUtil.assertOnUiThread();
        return !customDrawOrderDisabled() ? getDrawingOrderHelper().a(childCount, index) : index;
    }

    @Override // defpackage.wjc
    public void getClippingRect(Rect outClippingRect) {
        outClippingRect.getClass();
        Rect rect = this.clippingRect;
        if (rect != null) {
            outClippingRect.set(rect);
        } else {
            r6.g("Required value was null.");
        }
    }

    public Rect getHitSlopRect() {
        return this.hitSlopRect;
    }

    @Override // defpackage.gnc
    public String getOverflow() {
        fxa fxaVar = this._overflow;
        int i = fxaVar == null ? -1 : c.a[fxaVar.ordinal()];
        if (i == 1) {
            return "hidden";
        }
        if (i == 2) {
            return "scroll";
        }
        if (i != 3) {
            return null;
        }
        return "visible";
    }

    @Override // defpackage.hnc
    public Rect getOverflowInset() {
        return this.overflowInset;
    }

    @Override // defpackage.rnc
    public qeb getPointerEvents() {
        return this.pointerEvents;
    }

    /* JADX INFO: renamed from: getRemoveClippedSubviews, reason: from getter */
    public boolean get_removeClippedSubviews() {
        return this._removeClippedSubviews;
    }

    @Override // defpackage.zpc
    public int getZIndexMappedChildIndex(int index) {
        UiThreadUtil.assertOnUiThread();
        return (customDrawOrderDisabled() || getDrawingOrderHelper().b <= 0) ? index : getDrawingOrderHelper().a(getChildCount(), index);
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.needsOffscreenAlphaCompositing;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this._removeClippedSubviews) {
            updateClippingRect();
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent event) {
        event.getClass();
        if (!ReactFeatureFlags.dispatchPointerEvents) {
            return super.onHoverEvent(event);
        }
        qeb pointerEvents = getPointerEvents();
        qeb.a.getClass();
        return qeb.a.a(pointerEvents);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent event) {
        int i;
        event.getClass();
        oqa oqaVar = this.onInterceptTouchEventListener;
        if (oqaVar == null || (i = ((zo7) oqaVar).a) == -1 || event.getAction() == 1 || getId() != i) {
            qeb.a aVar = qeb.a;
            qeb pointerEvents = getPointerEvents();
            aVar.getClass();
            if (qeb.a.b(pointerEvents)) {
                return super.onInterceptTouchEvent(event);
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        eg9.a(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(View.MeasureSpec.getSize(widthMeasureSpec), View.MeasureSpec.getSize(heightMeasureSpec));
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        if (this._removeClippedSubviews) {
            updateClippingRect();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        event.getClass();
        qeb pointerEvents = getPointerEvents();
        qeb.a.getClass();
        return qeb.a.a(pointerEvents);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View child) {
        child.getClass();
        UiThreadUtil.assertOnUiThread();
        checkViewClippingTag(child, false);
        if (customDrawOrderDisabled()) {
            setChildrenDrawingOrderEnabled(false);
        } else {
            com.facebook.react.uimanager.c drawingOrderHelper = getDrawingOrderHelper();
            drawingOrderHelper.getClass();
            ViewGroupManager.INSTANCE.getClass();
            if (ViewGroupManager.Companion.a(child) != null) {
                drawingOrderHelper.b++;
            }
            drawingOrderHelper.c = null;
            setChildrenDrawingOrderEnabled(getDrawingOrderHelper().b > 0);
        }
        super.onViewAdded(child);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View child) {
        child.getClass();
        UiThreadUtil.assertOnUiThread();
        checkViewClippingTag(child, true);
        if (customDrawOrderDisabled()) {
            setChildrenDrawingOrderEnabled(false);
        } else {
            com.facebook.react.uimanager.c drawingOrderHelper = getDrawingOrderHelper();
            drawingOrderHelper.getClass();
            ViewGroupManager.INSTANCE.getClass();
            if (ViewGroupManager.Companion.a(child) != null) {
                drawingOrderHelper.b--;
            }
            drawingOrderHelper.c = null;
            setChildrenDrawingOrderEnabled(getDrawingOrderHelper().b > 0);
        }
        if (child.getParent() != null) {
            trackChildViewTransition(child.getId());
        }
        super.onViewRemoved(child);
    }

    public void recycleView$ReactAndroid_release() {
        a aVar;
        this.recycleCount++;
        View[] viewArr = this.allChildren;
        if (viewArr != null && (aVar = this.childrenLayoutChangeListener) != null) {
            if (aVar != null) {
                aVar.a = null;
            }
            int i = this.allChildrenCount;
            for (int i2 = 0; i2 < i; i2++) {
                View view = viewArr[i2];
                if (view != null) {
                    view.removeOnLayoutChangeListener(this.childrenLayoutChangeListener);
                }
            }
        }
        initView();
        getOverflowInset().setEmpty();
        removeAllViews();
        if (getParent() != null) {
            ViewParent parent = getParent();
            parent.getClass();
            ((ViewGroup) parent).removeView(this);
        }
        updateBackgroundDrawable(null);
        resetPointerEvents();
    }

    public final void removeAllViewsWithSubviewClippingEnabled$ReactAndroid_release() {
        if (!this._removeClippedSubviews) {
            r6.g("Check failed.");
            return;
        }
        View[] viewArr = this.allChildren;
        if (viewArr == null) {
            r6.g("Required value was null.");
            return;
        }
        int i = this.allChildrenCount;
        for (int i2 = 0; i2 < i; i2++) {
            View view = viewArr[i2];
            if (view != null) {
                view.removeOnLayoutChangeListener(this.childrenLayoutChangeListener);
            }
        }
        removeAllViewsInLayout();
        this.allChildrenCount = 0;
    }

    public final void removeViewWithSubviewClippingEnabled$ReactAndroid_release(View view) {
        view.getClass();
        UiThreadUtil.assertOnUiThread();
        if (!this._removeClippedSubviews) {
            r6.g("Check failed.");
            return;
        }
        View[] viewArr = this.allChildren;
        if (viewArr == null) {
            r6.g("Required value was null.");
            return;
        }
        view.removeOnLayoutChangeListener(this.childrenLayoutChangeListener);
        int iIndexOfChildInAllChildren = indexOfChildInAllChildren(view);
        if (!isViewClipped(viewArr[iIndexOfChildInAllChildren], Integer.valueOf(iIndexOfChildInAllChildren))) {
            int i = 0;
            for (int i2 = 0; i2 < iIndexOfChildInAllChildren; i2++) {
                if (isViewClipped(viewArr[i2], Integer.valueOf(i2))) {
                    i++;
                }
            }
            removeViewsInLayout(iIndexOfChildInAllChildren - i, 1);
            invalidate();
        }
        removeFromArray(iIndexOfChildInAllChildren);
    }

    @Override // android.view.View, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public void requestLayout() {
    }

    public final void setAxOrderList(List<String> list) {
        this.axOrderList = list;
    }

    public final void setBackfaceVisibility(String backfaceVisibility) {
        backfaceVisibility.getClass();
        this.backfaceVisible = "visible".equals(backfaceVisibility);
        setBackfaceVisibilityDependantOpacity();
    }

    public final void setBackfaceVisibilityDependantOpacity() {
        if (this.backfaceVisible) {
            setAlpha(this.backfaceOpacity);
            return;
        }
        float rotationX = getRotationX();
        float rotationY = getRotationY();
        if (rotationX < -90.0f || rotationX >= 90.0f || rotationY < -90.0f || rotationY >= 90.0f) {
            setAlpha(0.0f);
        } else {
            setAlpha(this.backfaceOpacity);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        v71.j(this, Integer.valueOf(color));
    }

    public final void setBorderColor(int position, Integer color) {
        v71.l(this, (o49) o49.d0.get(position), color);
    }

    @sy3
    public final void setBorderRadius(float borderRadius, int position) {
        v71.m(this, (zi1) zi1.c.get(position), Float.isNaN(borderRadius) ? null : new ou8(borderRadius, pu8.a));
    }

    public final void setBorderStyle(String style) {
        cj1 cj1VarA;
        if (style != null) {
            cj1.a.getClass();
            cj1VarA = cj1.a.a(style);
        } else {
            cj1VarA = null;
        }
        v71.n(this, cj1VarA);
    }

    public final void setBorderWidth(int position, float width) {
        v71.o(this, (o49) o49.d0.get(position), Float.valueOf(nn2.C(width)));
    }

    public void setHitSlopRect(Rect rect) {
        this.hitSlopRect = rect;
    }

    public final void setNeedsOffscreenAlphaCompositing(boolean needsOffscreenAlphaCompositing) {
        this.needsOffscreenAlphaCompositing = needsOffscreenAlphaCompositing;
    }

    @Override // defpackage.jmc
    public void setOnInterceptTouchEventListener(oqa listener) {
        listener.getClass();
        this.onInterceptTouchEventListener = listener;
    }

    public final void setOpacityIfPossible(float opacity) {
        this.backfaceOpacity = opacity;
        setBackfaceVisibilityDependantOpacity();
    }

    public void setOverflow(String str) {
        fxa fxaVarA;
        if (str == null) {
            fxaVarA = fxa.b;
        } else {
            fxa.a.getClass();
            fxaVarA = fxa.a.a(str);
        }
        this._overflow = fxaVarA;
        invalidate();
    }

    @Override // defpackage.hnc
    public void setOverflowInset(int left, int top, int right, int bottom) {
        if (nh1.a(this) && (getOverflowInset().left != left || getOverflowInset().top != top || getOverflowInset().right != right || getOverflowInset().bottom != bottom)) {
            invalidate();
        }
        getOverflowInset().set(left, top, right, bottom);
    }

    public void setPointerEvents(qeb qebVar) {
        qebVar.getClass();
        this.pointerEvents = qebVar;
    }

    public void setRemoveClippedSubviews(boolean z) {
        if (z == this._removeClippedSubviews) {
            return;
        }
        this._removeClippedSubviews = z;
        this.childrenRemovedWhileTransitioning = null;
        if (z) {
            Rect rect = new Rect();
            xjc.a(this, rect);
            this.clippingRect = rect;
            int childCount = getChildCount();
            this.allChildrenCount = childCount;
            View[] viewArr = new View[Math.max(ARRAY_CAPACITY_INCREMENT, childCount)];
            a aVar = new a();
            aVar.a = this;
            this.childrenLayoutChangeListener = aVar;
            int i = this.allChildrenCount;
            for (int i2 = 0; i2 < i; i2++) {
                View childAt = getChildAt(i2);
                viewArr[i2] = childAt;
                childAt.addOnLayoutChangeListener(this.childrenLayoutChangeListener);
                Companion.getClass();
                childAt.setTag(R.id.view_clipped, Boolean.FALSE);
            }
            this.allChildren = viewArr;
            updateClippingRect();
            return;
        }
        View[] viewArr2 = this.allChildren;
        if (viewArr2 == null) {
            r6.g("Required value was null.");
            return;
        }
        if (this.childrenLayoutChangeListener == null) {
            r6.g("Required value was null.");
            return;
        }
        int i3 = this.allChildrenCount;
        for (int i4 = 0; i4 < i3; i4++) {
            View view = viewArr2[i4];
            if (view != null) {
                view.removeOnLayoutChangeListener(this.childrenLayoutChangeListener);
            }
        }
        Rect rect2 = this.clippingRect;
        if (rect2 == null) {
            r6.g("Required value was null.");
            return;
        }
        getDrawingRect(rect2);
        updateClippingToRect$default(this, rect2, null, 2, null);
        this.allChildren = null;
        this.clippingRect = null;
        this.allChildrenCount = 0;
        this.childrenLayoutChangeListener = null;
    }

    @sy3
    public final void setTranslucentBackgroundDrawable(Drawable background) {
        v71.q(this, background);
    }

    @Override // defpackage.wjc
    public void updateClippingRect(Set<Integer> excludedViews) {
        if (this._removeClippedSubviews) {
            Rect rect = this.clippingRect;
            if (rect == null) {
                r6.g("Required value was null.");
            } else {
                xjc.a(this, rect);
                updateClippingToRect(rect, excludedViews);
            }
        }
    }

    @Override // defpackage.zpc
    public void updateDrawingOrder() {
        if (customDrawOrderDisabled()) {
            return;
        }
        getDrawingOrderHelper().b();
        setChildrenDrawingOrderEnabled(getDrawingOrderHelper().b > 0);
        invalidate();
    }

    public void updateClippingRect() {
        updateClippingRect(null);
    }

    @sy3
    public final void setBorderRadius(float borderRadius) {
        v71.m(this, zi1.a, Float.isNaN(borderRadius) ? null : new ou8(borderRadius, pu8.a));
    }

    public final void setBorderRadius(zi1 property, ou8 borderRadius) {
        property.getClass();
        v71.m(this, property, borderRadius);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSubviewClipStatus(View subview) {
        if (!this._removeClippedSubviews || getParent() == null) {
            return;
        }
        Rect rect = this.clippingRect;
        if (rect != null) {
            View[] viewArr = this.allChildren;
            if (viewArr != null) {
                if (rect.intersects(subview.getLeft(), subview.getTop(), subview.getRight(), subview.getBottom()) != (!isViewClipped(subview, null))) {
                    this.inSubviewClippingLoop = true;
                    int i = this.allChildrenCount;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        if (i2 >= i) {
                            break;
                        }
                        View view = viewArr[i2];
                        if (view == subview) {
                            updateSubviewClipStatus$default(this, rect, i2, i3, null, 8, null);
                            break;
                        } else {
                            if (isViewClipped(view, Integer.valueOf(i2))) {
                                i3++;
                            }
                            i2++;
                        }
                    }
                    this.inSubviewClippingLoop = false;
                    return;
                }
                return;
            }
            r6.g("Required value was null.");
            return;
        }
        r6.g("Required value was null.");
    }
}
