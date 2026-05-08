package com.facebook.react.views.textinput;

import android.R;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.method.QwertyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.datadog.android.rum.internal.domain.event.RumEventDeserializer;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.scroll.g;
import com.facebook.react.views.textinput.ReactTextInputManager;
import defpackage.apc;
import defpackage.cj1;
import defpackage.di1;
import defpackage.dmc;
import defpackage.gpc;
import defpackage.hpc;
import defpackage.ikc;
import defpackage.ipc;
import defpackage.j6;
import defpackage.kc9;
import defpackage.kpc;
import defpackage.l5;
import defpackage.lc9;
import defpackage.lpc;
import defpackage.m5d;
import defpackage.mkf;
import defpackage.nmc;
import defpackage.noc;
import defpackage.npc;
import defpackage.o49;
import defpackage.ou8;
import defpackage.phf;
import defpackage.ppc;
import defpackage.pq3;
import defpackage.pu8;
import defpackage.pxc;
import defpackage.ql5;
import defpackage.qpc;
import defpackage.r6;
import defpackage.rjc;
import defpackage.s55;
import defpackage.snc;
import defpackage.sy3;
import defpackage.tnc;
import defpackage.v71;
import defpackage.vse;
import defpackage.wl7;
import defpackage.xm8;
import defpackage.z92;
import defpackage.zi1;
import defpackage.zoc;
import defpackage.zr4;
import defpackage.zve;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
@nmc(name = ReactTextInputManager.REACT_CLASS)
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b;\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u000b\b\u0017\u0018\u0000 ¼\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002½\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u000e\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u000e\u0010\u0012J\u0017\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00170\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00170\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u001b\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001b0\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u0019J)\u0010\"\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0017¢\u0006\u0004\b\"\u0010#J)\u0010\"\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b\"\u0010$J\u001f\u0010'\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0017H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u001bH\u0007¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,H\u0007¢\u0006\u0004\b.\u0010/J!\u00101\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\b\u00100\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b1\u00102J\u001f\u00104\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\u0006\u00103\u001a\u00020,H\u0007¢\u0006\u0004\b4\u0010/J!\u00106\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\b\u00105\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b6\u00102J!\u00108\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\b\u00107\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b8\u00102J!\u0010:\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\b\u00109\u001a\u0004\u0018\u00010\u001fH\u0007¢\u0006\u0004\b:\u0010;J\u001f\u0010>\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010=\u001a\u00020<H\u0007¢\u0006\u0004\b>\u0010?J!\u0010A\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\b\u0010@\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\bA\u00102J\u001f\u0010C\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010B\u001a\u00020<H\u0007¢\u0006\u0004\bC\u0010?J!\u0010E\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\b\u0010D\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\bE\u00102J\u001f\u0010G\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010F\u001a\u00020<H\u0007¢\u0006\u0004\bG\u0010?J\u001f\u0010I\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010H\u001a\u00020<H\u0007¢\u0006\u0004\bI\u0010?J\u001f\u0010K\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010J\u001a\u00020<H\u0007¢\u0006\u0004\bK\u0010?J\u001f\u0010M\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010L\u001a\u00020,H\u0007¢\u0006\u0004\bM\u0010/J\u001f\u0010O\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010N\u001a\u00020<H\u0007¢\u0006\u0004\bO\u0010?J!\u0010Q\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\b\u0010P\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\bQ\u00102J!\u0010S\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\b\u0010R\u001a\u0004\u0018\u00010\u001bH\u0007¢\u0006\u0004\bS\u0010TJ!\u0010U\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\b\u0010R\u001a\u0004\u0018\u00010\u001bH\u0007¢\u0006\u0004\bU\u0010TJ!\u0010V\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\b\u0010R\u001a\u0004\u0018\u00010\u001bH\u0007¢\u0006\u0004\bV\u0010TJ!\u0010W\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\b\u0010R\u001a\u0004\u0018\u00010\u001bH\u0007¢\u0006\u0004\bW\u0010TJ\u001f\u0010Y\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010X\u001a\u00020<H\u0007¢\u0006\u0004\bY\u0010?J\u001f\u0010[\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010Z\u001a\u00020<H\u0007¢\u0006\u0004\b[\u0010?J\u001f\u0010]\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010\\\u001a\u00020<H\u0007¢\u0006\u0004\b]\u0010?J!\u0010^\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\b\u0010R\u001a\u0004\u0018\u00010\u001bH\u0007¢\u0006\u0004\b^\u0010TJ!\u0010`\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\b\u0010_\u001a\u0004\u0018\u00010\u001bH\u0007¢\u0006\u0004\b`\u0010TJ!\u0010b\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\b\u0010a\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\bb\u00102J!\u0010d\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\b\u0010c\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\bd\u00102J!\u0010f\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\b\u0010e\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\bf\u00102J\u001f\u0010h\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010g\u001a\u00020\u001bH\u0007¢\u0006\u0004\bh\u0010+J\u001f\u0010j\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010i\u001a\u00020<H\u0007¢\u0006\u0004\bj\u0010?J\u001f\u0010l\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010k\u001a\u00020\u001bH\u0007¢\u0006\u0004\bl\u0010+J!\u0010n\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\b\u0010m\u001a\u0004\u0018\u00010\u001bH\u0007¢\u0006\u0004\bn\u0010TJ!\u0010p\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\b\u0010o\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\bp\u00102J!\u0010r\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\b\u0010q\u001a\u0004\u0018\u00010<H\u0007¢\u0006\u0004\br\u0010sJ\u001f\u0010u\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010t\u001a\u00020<H\u0007¢\u0006\u0004\bu\u0010?J\u001f\u0010w\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010v\u001a\u00020<H\u0007¢\u0006\u0004\bw\u0010?J\u001f\u0010z\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010y\u001a\u00020xH\u0007¢\u0006\u0004\bz\u0010{J!\u0010}\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\b\u0010|\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b}\u00102J!\u0010\u007f\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\b\u0010~\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u007f\u00102J$\u0010\u0081\u0001\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u001fH\u0007¢\u0006\u0005\b\u0081\u0001\u0010;J\"\u0010\u0083\u0001\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\u0007\u0010\u0082\u0001\u001a\u00020<H\u0007¢\u0006\u0005\b\u0083\u0001\u0010?J$\u0010\u0085\u0001\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0005\b\u0085\u0001\u00102J,\u0010\u0088\u0001\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\u0007\u0010\u0086\u0001\u001a\u00020\u001b2\u0007\u0010\u0087\u0001\u001a\u00020,H\u0007¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J$\u0010\u008b\u0001\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\t\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0005\b\u008b\u0001\u00102J\"\u0010\u008c\u0001\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\u0007\u0010\u008c\u0001\u001a\u00020<H\u0007¢\u0006\u0005\b\u008c\u0001\u0010?J\"\u0010\u008e\u0001\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\u0007\u0010\u008d\u0001\u001a\u00020<H\u0007¢\u0006\u0005\b\u008e\u0001\u0010?J$\u0010\u0090\u0001\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0005\b\u0090\u0001\u00102J,\u0010\u0092\u0001\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\u0007\u0010\u0086\u0001\u001a\u00020\u001b2\u0007\u0010\u0091\u0001\u001a\u00020,H\u0007¢\u0006\u0006\b\u0092\u0001\u0010\u0089\u0001J-\u0010\u0093\u0001\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\u0007\u0010\u0086\u0001\u001a\u00020\u001b2\b\u0010R\u001a\u0004\u0018\u00010\u001bH\u0007¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J$\u0010\u0096\u0001\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\t\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0005\b\u0096\u0001\u00102J\u001a\u0010\u0097\u0001\u001a\u00020!2\u0006\u0010%\u001a\u00020\u0002H\u0014¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J$\u0010\u009b\u0001\u001a\u00020!2\u0007\u0010\u0099\u0001\u001a\u00020\t2\u0007\u0010\u009a\u0001\u001a\u00020\u0002H\u0014¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u001d\u0010\u009d\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00170\u0016H\u0016¢\u0006\u0005\b\u009d\u0001\u0010\u0019J>\u0010¢\u0001\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\u0007\u0010\u009e\u0001\u001a\u00020\u001b2\u0007\u0010\u009f\u0001\u001a\u00020\u001b2\u0007\u0010 \u0001\u001a\u00020\u001b2\u0007\u0010¡\u0001\u001a\u00020\u001bH\u0016¢\u0006\u0006\b¢\u0001\u0010£\u0001J0\u0010¨\u0001\u001a\u0004\u0018\u00010\u00172\u0006\u0010%\u001a\u00020\u00022\b\u0010¥\u0001\u001a\u00030¤\u00012\b\u0010§\u0001\u001a\u00030¦\u0001H\u0016¢\u0006\u0006\b¨\u0001\u0010©\u0001J.\u0010¬\u0001\u001a\u0004\u0018\u00010\u00172\u0006\u0010%\u001a\u00020\u00022\b\u0010¥\u0001\u001a\u00030¤\u00012\b\u0010«\u0001\u001a\u00030ª\u0001¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J'\u0010¬\u0001\u001a\u00030°\u00012\t\u0010®\u0001\u001a\u0004\u0018\u00010\u00062\u0007\u0010¯\u0001\u001a\u00020\u001bH\u0002¢\u0006\u0006\b¬\u0001\u0010±\u0001J \u0010A\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\u0007\u0010²\u0001\u001a\u00020\u001bH\u0002¢\u0006\u0004\bA\u0010+J0\u0010µ\u0001\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00022\u0014\u0010´\u0001\u001a\u000b\u0012\u0006\b\u0001\u0012\u00020\u00060³\u0001\"\u00020\u0006H\u0002¢\u0006\u0006\bµ\u0001\u0010¶\u0001R)\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0004@\u0004X\u0084\u000e¢\u0006\u0017\n\u0005\b\u0011\u0010·\u0001\u001a\u0006\b¸\u0001\u0010¹\u0001\"\u0006\bº\u0001\u0010»\u0001¨\u0006¾\u0001"}, d2 = {"Lcom/facebook/react/views/textinput/ReactTextInputManager;", "Lcom/facebook/react/uimanager/BaseViewManager;", "Likc;", "Lxm8;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lmkf;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "createViewInstance", "(Lmkf;)Likc;", "Lrjc;", "createShadowNodeInstance", "()Lrjc;", "Lppc;", "reactTextViewManagerCallback", "(Lppc;)Lrjc;", "Ljava/lang/Class;", "getShadowNodeClass", "()Ljava/lang/Class;", "", "", "getExportedCustomBubblingEventTypeConstants", "()Ljava/util/Map;", "getExportedCustomDirectEventTypeConstants", "", "getCommandsMap", "reactEditText", "commandId", "Lcom/facebook/react/bridge/ReadableArray;", "args", "Lj6g;", "receiveCommand", "(Likc;ILcom/facebook/react/bridge/ReadableArray;)V", "(Likc;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "view", "extraData", "updateExtraData", "(Likc;Ljava/lang/Object;)V", "lineHeight", "setLineHeight", "(Likc;I)V", "", "fontSize", "setFontSize", "(Likc;F)V", "fontFamily", "setFontFamily", "(Likc;Ljava/lang/String;)V", "maxFontSizeMultiplier", "setMaxFontSizeMultiplier", "fontWeight", "setFontWeight", "fontStyle", "setFontStyle", "fontVariant", "setFontVariant", "(Likc;Lcom/facebook/react/bridge/ReadableArray;)V", "", "includepad", "setIncludeFontPadding", "(Likc;Z)V", "value", "setImportantForAutofill", "onSelectionChange", "setOnSelectionChange", "submitBehavior", "setSubmitBehavior", "onContentSizeChange", "setOnContentSizeChange", "onScroll", "setOnScroll", "onKeyPress", "setOnKeyPress", "letterSpacing", "setLetterSpacing", "allowFontScaling", "setAllowFontScaling", "placeholder", "setPlaceholder", "color", "setPlaceholderTextColor", "(Likc;Ljava/lang/Integer;)V", "setSelectionColor", "setSelectionHandleColor", "setCursorColor", "caretHidden", "setCaretHidden", "contextMenuHidden", "setContextMenuHidden", "selectTextOnFocus", "setSelectTextOnFocus", "setColor", "underlineColor", "setUnderlineColor", "textAlign", "setTextAlign", "textAlignVertical", "setTextAlignVertical", RumEventDeserializer.EVENT_TYPE_RESOURCE, "setInlineImageLeft", "padding", "setInlineImagePadding", "editable", "setEditable", "numLines", "setNumLines", "maxLength", "setMaxLength", "autoComplete", "setTextContentType", "autoCorrect", "setAutoCorrect", "(Likc;Ljava/lang/Boolean;)V", "multiline", "setMultiline", "password", "setSecureTextEntry", "Lcom/facebook/react/bridge/Dynamic;", "autoCapitalize", "setAutoCapitalize", "(Likc;Lcom/facebook/react/bridge/Dynamic;)V", "keyboardType", "setKeyboardType", "returnKeyType", "setReturnKeyType", "acceptDragAndDropTypes", "setAcceptDragAndDropTypes", "disableFullscreenUI", "setDisableFullscreenUI", "returnKeyLabel", "setReturnKeyLabel", "index", "borderRadius", "setBorderRadius", "(Likc;IF)V", "borderStyle", "setBorderStyle", "showKeyboardOnFocus", "autoFocus", "setAutoFocus", "textDecorationLineString", "setTextDecorationLine", "width", "setBorderWidth", "setBorderColor", "(Likc;ILjava/lang/Integer;)V", "overflow", "setOverflow", "onAfterUpdateTransaction", "(Likc;)V", "reactContext", "editText", "addEventEmitters", "(Lmkf;Likc;)V", "getExportedViewConstants", GesturesListener.SCROLL_DIRECTION_LEFT, "top", GesturesListener.SCROLL_DIRECTION_RIGHT, "bottom", "setPadding", "(Likc;IIII)V", "Lnoc;", "props", "Lvse;", "stateWrapper", "updateState", "(Likc;Lnoc;Lvse;)Ljava/lang/Object;", "Lcom/facebook/react/common/mapbuffer/a;", "state", "getReactTextUpdate", "(Likc;Lnoc;Lcom/facebook/react/common/mapbuffer/a;)Ljava/lang/Object;", "text", "mostRecentEventCount", "Lnpc;", "(Ljava/lang/String;I)Lnpc;", "mode", "", "hints", "setAutofillHints", "(Likc;[Ljava/lang/String;)V", "Lppc;", "getReactTextViewManagerCallback", "()Lppc;", "setReactTextViewManagerCallback", "(Lppc;)V", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ReactTextInputManager extends BaseViewManager<ikc, xm8> {
    private static final int AUTOCAPITALIZE_FLAGS = 28672;
    private static final int BLUR_TEXT_INPUT = 2;
    private static final int FOCUS_TEXT_INPUT = 1;
    private static final int IME_ACTION_ID = 1648;
    private static final int INPUT_TYPE_KEYBOARD_DECIMAL_PAD = 8194;
    private static final int INPUT_TYPE_KEYBOARD_NUMBERED = 12290;
    private static final int INPUT_TYPE_KEYBOARD_NUMBER_PAD = 2;
    private static final String KEYBOARD_TYPE_DECIMAL_PAD = "decimal-pad";
    private static final String KEYBOARD_TYPE_EMAIL_ADDRESS = "email-address";
    private static final String KEYBOARD_TYPE_NUMBER_PAD = "number-pad";
    private static final String KEYBOARD_TYPE_NUMERIC = "numeric";
    private static final String KEYBOARD_TYPE_PHONE_PAD = "phone-pad";
    private static final String KEYBOARD_TYPE_URI = "url";
    private static final String KEYBOARD_TYPE_VISIBLE_PASSWORD = "visible-password";
    public static final String REACT_CLASS = "AndroidTextInput";
    private static final int SET_MOST_RECENT_EVENT_COUNT = 3;
    private static final int SET_TEXT_AND_SELECTION = 4;
    private static final String TAG = "ReactTextInputManager";
    private static final short TX_STATE_KEY_ATTRIBUTED_STRING = 0;
    private static final short TX_STATE_KEY_MOST_RECENT_EVENT_COUNT = 3;
    private static final short TX_STATE_KEY_PARAGRAPH_ATTRIBUTES = 1;
    private static final int UNSET = -1;
    private ppc reactTextViewManagerCallback;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final Map<String, String> REACT_PROPS_AUTOFILL_HINTS_MAP = lc9.a0(new Pair("birthdate-day", "birthDateDay"), new Pair("birthdate-full", "birthDateFull"), new Pair("birthdate-month", "birthDateMonth"), new Pair("birthdate-year", "birthDateYear"), new Pair("cc-csc", "creditCardSecurityCode"), new Pair("cc-exp", "creditCardExpirationDate"), new Pair("cc-exp-day", "creditCardExpirationDay"), new Pair("cc-exp-month", "creditCardExpirationMonth"), new Pair("cc-exp-year", "creditCardExpirationYear"), new Pair("cc-number", "creditCardNumber"), new Pair("email", "emailAddress"), new Pair("gender", "gender"), new Pair("name", "personName"), new Pair("name-family", "personFamilyName"), new Pair("name-given", "personGivenName"), new Pair("name-middle", "personMiddleName"), new Pair("name-middle-initial", "personMiddleInitial"), new Pair("name-prefix", "personNamePrefix"), new Pair("name-suffix", "personNameSuffix"), new Pair("password", "password"), new Pair("password-new", "newPassword"), new Pair("postal-address", "postalAddress"), new Pair("postal-address-country", "addressCountry"), new Pair("postal-address-extended", "extendedAddress"), new Pair("postal-address-extended-postal-code", "extendedPostalCode"), new Pair("postal-address-locality", "addressLocality"), new Pair("postal-address-region", "addressRegion"), new Pair("postal-code", "postalCode"), new Pair("street-address", "streetAddress"), new Pair("sms-otp", "smsOTPCode"), new Pair("tel", "phoneNumber"), new Pair("tel-country-code", "phoneCountryCode"), new Pair("tel-national", "phoneNational"), new Pair("tel-device", "phoneNumberDevice"), new Pair("username", "username"), new Pair("username-new", "newUsername"));
    private static final InputFilter[] EMPTY_FILTERS = new InputFilter[0];
    private static final String[] DRAWABLE_HANDLE_RESOURCES = {"mTextSelectHandleLeftRes", "mTextSelectHandleRightRes", "mTextSelectHandleRes"};
    private static final String[] DRAWABLE_HANDLE_FIELDS = {"mSelectHandleLeft", "mSelectHandleRight", "mSelectHandleCenter"};

    /* JADX INFO: renamed from: com.facebook.react.views.textinput.ReactTextInputManager$a, reason: from kotlin metadata */
    public static final class Companion {
        public static final void a(Companion companion, ikc ikcVar) {
            companion.getClass();
            if ((ikcVar.getStagedInputType() & ReactTextInputManager.INPUT_TYPE_KEYBOARD_NUMBERED) == 0 || (ikcVar.getStagedInputType() & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
                return;
            }
            c(ikcVar, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, 16);
        }

        public static final boolean b(Companion companion) {
            companion.getClass();
            String str = Build.MANUFACTURER;
            str.getClass();
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            return Build.VERSION.SDK_INT == 29 && zve.L(lowerCase, "xiaomi", false);
        }

        public static void c(ikc ikcVar, int i, int i2) {
            ikcVar.setStagedInputType(((~i) & ikcVar.getStagedInputType()) | i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addEventEmitters$lambda$2(mkf mkfVar, ikc ikcVar, View view, boolean z) {
        int i = mkfVar.b;
        INSTANCE.getClass();
        EventDispatcher eventDispatcherE = dmc.e(mkfVar, ikcVar.getId());
        if (z) {
            if (eventDispatcherE != null) {
                eventDispatcherE.a(new ql5(i, ikcVar.getId(), 0));
            }
        } else {
            if (eventDispatcherE != null) {
                eventDispatcherE.a(new di1(i, ikcVar.getId()));
            }
            if (eventDispatcherE != null) {
                eventDispatcherE.a(new apc(i, ikcVar.getId(), String.valueOf(ikcVar.getText())));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean addEventEmitters$lambda$3(ikc ikcVar, mkf mkfVar, TextView textView, int i, KeyEvent keyEvent) {
        if ((i & 255) != 0 || i == 0) {
            boolean zE = ikcVar.e();
            boolean zJ = ikcVar.j();
            String str = ikcVar.h0;
            boolean zEquals = str == null ? !ikcVar.e() : str.equals("blurAndSubmit");
            if (zJ) {
                INSTANCE.getClass();
                EventDispatcher eventDispatcherE = dmc.e(mkfVar, ikcVar.getId());
                if (eventDispatcherE != null) {
                    eventDispatcherE.a(new hpc(String.valueOf(ikcVar.getText()), mkfVar.b, ikcVar.getId(), 0));
                }
            }
            if (zEquals) {
                ikcVar.d();
            }
            if (!zEquals && !zJ && zE && i != 5 && i != 7) {
                return false;
            }
        }
        return true;
    }

    private final void setAutofillHints(ikc view, String... hints) {
        view.setAutofillHints((String[]) Arrays.copyOf(hints, hints.length));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(final mkf reactContext, final ikc editText) {
        reactContext.getClass();
        editText.getClass();
        INSTANCE.getClass();
        editText.setEventDispatcher(dmc.e(reactContext, editText.getId()));
        editText.addTextChangedListener(new ipc(reactContext, editText));
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: dpc
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                ReactTextInputManager.addEventEmitters$lambda$2(reactContext, editText, view, z);
            }
        });
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: epc
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return ReactTextInputManager.addEventEmitters$lambda$3(editText, reactContext, textView, i, keyEvent);
            }
        });
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public rjc createShadowNodeInstance() {
        return new gpc(null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ikc createViewInstance(mkf context) {
        context.getClass();
        ikc ikcVar = new ikc(context);
        ikcVar.setInputType(ikcVar.getInputType() & (-131073));
        ikcVar.setReturnKeyType("done");
        ikcVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return ikcVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return lc9.a0(new Pair("focusTextInput", 1), new Pair("blurTextInput", 2));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        Map<String, Object> exportedCustomBubblingEventTypeConstants = super.getExportedCustomBubblingEventTypeConstants();
        if (exportedCustomBubblingEventTypeConstants == null) {
            exportedCustomBubblingEventTypeConstants = new LinkedHashMap<>();
        }
        exportedCustomBubblingEventTypeConstants.putAll(lc9.a0(new Pair("topSubmitEditing", kc9.W(new Pair("phasedRegistrationNames", lc9.a0(new Pair("bubbled", "onSubmitEditing"), new Pair("captured", "onSubmitEditingCapture"))))), new Pair("topEndEditing", kc9.W(new Pair("phasedRegistrationNames", lc9.a0(new Pair("bubbled", "onEndEditing"), new Pair("captured", "onEndEditingCapture"))))), new Pair("topKeyPress", kc9.W(new Pair("phasedRegistrationNames", lc9.a0(new Pair("bubbled", "onKeyPress"), new Pair("captured", "onKeyPressCapture")))))));
        return exportedCustomBubblingEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new LinkedHashMap<>();
        }
        g.a.getClass();
        exportedCustomDirectEventTypeConstants.putAll(kc9.W(new Pair(g.a.a(g.d), j6.c("registrationName", "onScroll"))));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        return kc9.W(new Pair("AutoCapitalizationType", lc9.a0(new Pair("none", 0), new Pair("characters", 4096), new Pair("words", 8192), new Pair("sentences", 16384))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getReactTextUpdate(defpackage.ikc r21, defpackage.noc r22, com.facebook.react.common.mapbuffer.a r23) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.textinput.ReactTextInputManager.getReactTextUpdate(ikc, noc, com.facebook.react.common.mapbuffer.a):java.lang.Object");
    }

    public final ppc getReactTextViewManagerCallback() {
        return this.reactTextViewManagerCallback;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends xm8> getShadowNodeClass() {
        return gpc.class;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(ikc view) {
        view.getClass();
        super.onAfterUpdateTransaction(view);
        if (view.r0) {
            view.r0 = false;
            Typeface typeface = view.getTypeface();
            int i = view.u0;
            int i2 = view.t0;
            String str = view.s0;
            AssetManager assets = view.getContext().getAssets();
            assets.getClass();
            view.setTypeface(qpc.a(typeface, i, i2, str, assets));
            view.setPaintFlags((view.u0 == -1 && view.t0 == -1 && view.s0 == null && view.getFontFeatureSettings() == null) ? view.getPaintFlags() & (-129) : view.getPaintFlags() | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        }
        if (view.getInputType() != view.f0) {
            int selectionStart = view.getSelectionStart();
            int selectionEnd = view.getSelectionEnd();
            view.setInputType(view.f0);
            view.f(selectionStart, selectionEnd);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ikc reactEditText, String commandId, ReadableArray args) {
        reactEditText.getClass();
        commandId.getClass();
        switch (commandId.hashCode()) {
            case -1699362314:
                if (!commandId.equals("blurTextInput")) {
                    return;
                }
                break;
            case 3027047:
                if (!commandId.equals("blur")) {
                    return;
                }
                break;
            case 97604824:
                if (!commandId.equals("focus")) {
                    return;
                }
                reactEditText.i();
                return;
            case 1427010500:
                if (commandId.equals("setTextAndSelection")) {
                    if (args == null) {
                        r6.g("Required value was null.");
                        return;
                    }
                    int i = args.getInt(0);
                    if (i == -1) {
                        return;
                    }
                    int i2 = args.getInt(2);
                    int i3 = args.getInt(3);
                    if (i3 == -1) {
                        i3 = i2;
                    }
                    if (!args.isNull(1)) {
                        npc reactTextUpdate = getReactTextUpdate(args.getString(1), i);
                        reactTextUpdate.getClass();
                        reactEditText.a0 = true;
                        reactEditText.g(reactTextUpdate);
                        reactEditText.a0 = false;
                    }
                    if (i >= reactEditText.d0) {
                        reactEditText.f(i2, i3);
                        return;
                    }
                    return;
                }
                return;
            case 1690703013:
                if (!commandId.equals("focusTextInput")) {
                    return;
                }
                reactEditText.i();
                return;
            default:
                return;
        }
        reactEditText.d();
    }

    @snc(name = "acceptDragAndDropTypes")
    public final void setAcceptDragAndDropTypes(ikc view, ReadableArray acceptDragAndDropTypes) {
        view.getClass();
        if (acceptDragAndDropTypes == null) {
            view.setDragAndDropFilter(null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = acceptDragAndDropTypes.size();
        for (int i = 0; i < size; i++) {
            String string = acceptDragAndDropTypes.getString(i);
            if (string != null) {
                arrayList.add(string);
            }
        }
        view.setDragAndDropFilter(arrayList);
    }

    @snc(defaultBoolean = true, name = "allowFontScaling")
    public final void setAllowFontScaling(ikc view, boolean allowFontScaling) {
        view.getClass();
        view.setAllowFontScaling(allowFontScaling);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    @defpackage.snc(name = "autoCapitalize")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setAutoCapitalize(defpackage.ikc r3, com.facebook.react.bridge.Dynamic r4) {
        /*
            r2 = this;
            r3.getClass()
            r4.getClass()
            com.facebook.react.bridge.ReadableType r2 = r4.getType()
            com.facebook.react.bridge.ReadableType r0 = com.facebook.react.bridge.ReadableType.Number
            if (r2 != r0) goto L13
            int r2 = r4.asInt()
            goto L54
        L13:
            com.facebook.react.bridge.ReadableType r2 = r4.getType()
            com.facebook.react.bridge.ReadableType r0 = com.facebook.react.bridge.ReadableType.String
            r1 = 16384(0x4000, float:2.2959E-41)
            if (r2 != r0) goto L3d
            java.lang.String r2 = r4.asString()
            if (r2 == 0) goto L3d
            int r4 = r2.hashCode()
            switch(r4) {
                case 3387192: goto L4b;
                case 113318569: goto L3f;
                case 490141296: goto L37;
                case 1245424234: goto L2b;
                default: goto L2a;
            }
        L2a:
            goto L3d
        L2b:
            java.lang.String r4 = "characters"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L34
            goto L3d
        L34:
            r2 = 4096(0x1000, float:5.74E-42)
            goto L54
        L37:
            java.lang.String r4 = "sentences"
            boolean r2 = r2.equals(r4)
        L3d:
            r2 = r1
            goto L54
        L3f:
            java.lang.String r4 = "words"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L48
            goto L3d
        L48:
            r2 = 8192(0x2000, float:1.14794E-41)
            goto L54
        L4b:
            java.lang.String r4 = "none"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L3d
            r2 = 0
        L54:
            com.facebook.react.views.textinput.ReactTextInputManager$a r4 = com.facebook.react.views.textinput.ReactTextInputManager.INSTANCE
            r4.getClass()
            r4 = 28672(0x7000, float:4.0178E-41)
            com.facebook.react.views.textinput.ReactTextInputManager.Companion.c(r3, r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.textinput.ReactTextInputManager.setAutoCapitalize(ikc, com.facebook.react.bridge.Dynamic):void");
    }

    @snc(name = "autoCorrect")
    public final void setAutoCorrect(ikc view, Boolean autoCorrect) {
        view.getClass();
        Companion companion = INSTANCE;
        int i = wl7.b(autoCorrect, Boolean.TRUE) ? 32768 : wl7.b(autoCorrect, Boolean.FALSE) ? 524288 : 0;
        companion.getClass();
        Companion.c(view, 557056, i);
    }

    @snc(defaultBoolean = false, name = "autoFocus")
    public final void setAutoFocus(ikc view, boolean autoFocus) {
        view.getClass();
        view.setAutoFocus(autoFocus);
    }

    @tnc(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public final void setBorderColor(ikc view, int index, Integer color) {
        view.getClass();
        v71.l(view, o49.b, color);
    }

    @tnc(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public final void setBorderRadius(ikc view, int index, float borderRadius) {
        view.getClass();
        v71.m(view, (zi1) zi1.c.get(index), Float.isNaN(borderRadius) ? null : new ou8(borderRadius, pu8.a));
    }

    @snc(name = "borderStyle")
    public final void setBorderStyle(ikc view, String borderStyle) {
        cj1 cj1VarA;
        view.getClass();
        if (borderStyle != null) {
            cj1.a.getClass();
            cj1VarA = cj1.a.a(borderStyle);
        } else {
            cj1VarA = null;
        }
        v71.n(view, cj1VarA);
    }

    @tnc(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public final void setBorderWidth(ikc view, int index, float width) {
        view.getClass();
        v71.o(view, (o49) o49.d0.get(index), Float.valueOf(width));
    }

    @snc(defaultBoolean = false, name = "caretHidden")
    public final void setCaretHidden(ikc view, boolean caretHidden) {
        view.getClass();
        if (view.getStagedInputType() == 32 && Companion.b(INSTANCE)) {
            return;
        }
        view.setCursorVisible(!caretHidden);
    }

    @snc(customType = "Color", name = "color")
    public final void setColor(ikc view, Integer color) {
        view.getClass();
        if (color != null) {
            view.setTextColor(color.intValue());
            return;
        }
        Context context = view.getContext();
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.textColor});
        typedArrayObtainStyledAttributes.getClass();
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
        if (colorStateList != null) {
            view.setTextColor(colorStateList);
        } else {
            Context context2 = view.getContext();
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException(l5.l("Could not get default text color from View Context: ", context2 != null ? context2.getClass().getCanonicalName() : "null")));
        }
    }

    @snc(defaultBoolean = false, name = "contextMenuHidden")
    public final void setContextMenuHidden(ikc view, boolean contextMenuHidden) {
        view.getClass();
        view.setContextMenuHidden(contextMenuHidden);
    }

    @snc(customType = "Color", name = "cursorColor")
    public final void setCursorColor(ikc view, Integer color) {
        view.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            Drawable textCursorDrawable = view.getTextCursorDrawable();
            if (textCursorDrawable != null) {
                if (color != null) {
                    textCursorDrawable.setColorFilter(new BlendModeColorFilter(color.intValue(), BlendMode.SRC_IN));
                } else {
                    textCursorDrawable.clearColorFilter();
                }
                view.setTextCursorDrawable(textCursorDrawable);
                return;
            }
            return;
        }
        if (i == 28) {
            return;
        }
        try {
            Field declaredField = ikc.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i2 = declaredField.getInt(view);
            if (i2 == 0) {
                return;
            }
            Drawable drawable = view.getContext().getDrawable(i2);
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            if (drawableMutate == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (color != null) {
                drawableMutate.setColorFilter(color.intValue(), PorterDuff.Mode.SRC_IN);
            } else {
                drawableMutate.clearColorFilter();
            }
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(view);
            if (obj == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            declaredField3.set(obj, new Drawable[]{drawableMutate, drawableMutate});
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
    }

    @snc(defaultBoolean = false, name = "disableFullscreenUI")
    public final void setDisableFullscreenUI(ikc view, boolean disableFullscreenUI) {
        view.getClass();
        view.setDisableFullscreenUI(disableFullscreenUI);
    }

    @snc(defaultBoolean = true, name = "editable")
    public final void setEditable(ikc view, boolean editable) {
        view.getClass();
        view.setEnabled(editable);
    }

    @snc(name = "fontFamily")
    public final void setFontFamily(ikc view, String fontFamily) {
        view.getClass();
        view.setFontFamily(fontFamily);
    }

    @snc(defaultFloat = 14.0f, name = "fontSize")
    public final void setFontSize(ikc view, float fontSize) {
        view.getClass();
        view.setFontSize(fontSize);
    }

    @snc(name = "fontStyle")
    public final void setFontStyle(ikc view, String fontStyle) {
        view.getClass();
        view.setFontStyle(fontStyle);
    }

    @snc(name = "fontVariant")
    public final void setFontVariant(ikc view, ReadableArray fontVariant) {
        view.getClass();
        view.setFontFeatureSettings(qpc.c(fontVariant));
    }

    @snc(name = "fontWeight")
    public final void setFontWeight(ikc view, String fontWeight) {
        view.getClass();
        view.setFontWeight(fontWeight);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004a  */
    @defpackage.snc(name = "importantForAutofill")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setImportantForAutofill(defpackage.ikc r3, java.lang.String r4) {
        /*
            r2 = this;
            r3.getClass()
            if (r4 == 0) goto L4a
            int r0 = r4.hashCode()
            r1 = 3521(0xdc1, float:4.934E-42)
            if (r0 == r1) goto L3f
            r1 = 119527(0x1d2e7, float:1.67493E-40)
            if (r0 == r1) goto L34
            r1 = 1723649149(0x66bccc7d, float:4.4578852E23)
            if (r0 == r1) goto L28
            r1 = 1828836387(0x6d01d423, float:2.5112515E27)
            if (r0 == r1) goto L1d
            goto L4a
        L1d:
            java.lang.String r0 = "yesExcludeDescendants"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L26
            goto L4a
        L26:
            r4 = 4
            goto L4b
        L28:
            java.lang.String r0 = "noExcludeDescendants"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L31
            goto L4a
        L31:
            r4 = 8
            goto L4b
        L34:
            java.lang.String r0 = "yes"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L3d
            goto L4a
        L3d:
            r4 = 1
            goto L4b
        L3f:
            java.lang.String r0 = "no"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L48
            goto L4a
        L48:
            r4 = 2
            goto L4b
        L4a:
            r4 = 0
        L4b:
            r2.setImportantForAutofill(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.textinput.ReactTextInputManager.setImportantForAutofill(ikc, java.lang.String):void");
    }

    @snc(defaultBoolean = true, name = "includeFontPadding")
    public final void setIncludeFontPadding(ikc view, boolean includepad) {
        view.getClass();
        view.setIncludeFontPadding(includepad);
    }

    @snc(name = "inlineImageLeft")
    public final void setInlineImageLeft(ikc view, String resource) {
        view.getClass();
        Context context = view.getContext();
        context.getClass();
        view.setCompoundDrawablesWithIntrinsicBounds(m5d.a(context, resource), 0, 0, 0);
    }

    @snc(name = "inlineImagePadding")
    public final void setInlineImagePadding(ikc view, int padding) {
        view.getClass();
        view.setCompoundDrawablePadding(padding);
    }

    @snc(name = "keyboardType")
    public final void setKeyboardType(ikc view, String keyboardType) {
        int i;
        view.getClass();
        if (KEYBOARD_TYPE_NUMERIC.equalsIgnoreCase(keyboardType)) {
            i = INPUT_TYPE_KEYBOARD_NUMBERED;
        } else if (KEYBOARD_TYPE_NUMBER_PAD.equalsIgnoreCase(keyboardType)) {
            i = 2;
        } else if (KEYBOARD_TYPE_DECIMAL_PAD.equalsIgnoreCase(keyboardType)) {
            i = INPUT_TYPE_KEYBOARD_DECIMAL_PAD;
        } else if (KEYBOARD_TYPE_EMAIL_ADDRESS.equalsIgnoreCase(keyboardType)) {
            if (Companion.b(INSTANCE)) {
                view.setCursorVisible(false);
            }
            i = 33;
        } else {
            i = KEYBOARD_TYPE_PHONE_PAD.equalsIgnoreCase(keyboardType) ? 3 : KEYBOARD_TYPE_VISIBLE_PASSWORD.equalsIgnoreCase(keyboardType) ? 144 : KEYBOARD_TYPE_URI.equalsIgnoreCase(keyboardType) ? 16 : 1;
        }
        Companion companion = INSTANCE;
        companion.getClass();
        Companion.c(view, 15, i);
        Companion.a(companion, view);
    }

    @snc(defaultFloat = 0.0f, name = "letterSpacing")
    public final void setLetterSpacing(ikc view, float letterSpacing) {
        view.getClass();
        view.setLetterSpacingPt(letterSpacing);
    }

    @snc(defaultFloat = 0.0f, name = "lineHeight")
    public final void setLineHeight(ikc view, int lineHeight) {
        view.getClass();
        view.setLineHeight(lineHeight);
    }

    @snc(defaultFloat = Float.NaN, name = "maxFontSizeMultiplier")
    public final void setMaxFontSizeMultiplier(ikc view, float maxFontSizeMultiplier) {
        view.getClass();
        view.setMaxFontSizeMultiplier(maxFontSizeMultiplier);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044 A[PHI: r0
  0x0044: PHI (r0v10 android.text.InputFilter[]) = (r0v8 android.text.InputFilter[]), (r0v0 android.text.InputFilter[]), (r0v0 android.text.InputFilter[]) binds: [B:31:0x006d, B:8:0x0015, B:16:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    @defpackage.snc(name = "maxLength")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setMaxLength(defpackage.ikc r7, java.lang.Integer r8) {
        /*
            r6 = this;
            r7.getClass()
            android.text.InputFilter[] r6 = r7.getFilters()
            android.text.InputFilter[] r0 = com.facebook.react.views.textinput.ReactTextInputManager.EMPTY_FILTERS
            r1 = 1
            r2 = 0
            if (r8 != 0) goto L46
            r6.getClass()
            int r8 = r6.length
            if (r8 != 0) goto L14
            goto L15
        L14:
            r1 = r2
        L15:
            if (r1 != 0) goto L44
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
            ct0 r1 = new ct0
            r1.<init>(r6)
        L21:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L35
            java.lang.Object r6 = r1.next()
            android.text.InputFilter r6 = (android.text.InputFilter) r6
            boolean r3 = r6 instanceof android.text.InputFilter.LengthFilter
            if (r3 != 0) goto L21
            r8.add(r6)
            goto L21
        L35:
            boolean r6 = r8.isEmpty()
            if (r6 != 0) goto L44
            android.text.InputFilter[] r6 = new android.text.InputFilter[r2]
            java.lang.Object[] r6 = r8.toArray(r6)
            android.text.InputFilter[] r6 = (android.text.InputFilter[]) r6
            goto L8f
        L44:
            r6 = r0
            goto L8f
        L46:
            r6.getClass()
            int r0 = r6.length
            if (r0 != 0) goto L4e
            r0 = r1
            goto L4f
        L4e:
            r0 = r2
        L4f:
            if (r0 != 0) goto L82
            int r0 = r6.length
            r3 = r2
            r4 = r3
        L54:
            if (r3 >= r0) goto L6b
            r5 = r6[r3]
            boolean r5 = r5 instanceof android.text.InputFilter.LengthFilter
            if (r5 == 0) goto L68
            android.text.InputFilter$LengthFilter r4 = new android.text.InputFilter$LengthFilter
            int r5 = r8.intValue()
            r4.<init>(r5)
            r6[r3] = r4
            r4 = r1
        L68:
            int r3 = r3 + 1
            goto L54
        L6b:
            if (r4 != 0) goto L8f
            int r0 = r6.length
            int r0 = r0 + r1
            android.text.InputFilter[] r0 = new android.text.InputFilter[r0]
            int r1 = r6.length
            java.lang.System.arraycopy(r6, r2, r0, r2, r1)
            int r1 = r6.length
            android.text.InputFilter$LengthFilter r2 = new android.text.InputFilter$LengthFilter
            int r8 = r8.intValue()
            r2.<init>(r8)
            r6[r1] = r2
            goto L44
        L82:
            android.text.InputFilter[] r6 = new android.text.InputFilter[r1]
            android.text.InputFilter$LengthFilter r0 = new android.text.InputFilter$LengthFilter
            int r8 = r8.intValue()
            r0.<init>(r8)
            r6[r2] = r0
        L8f:
            r7.setFilters(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.textinput.ReactTextInputManager.setMaxLength(ikc, java.lang.Integer):void");
    }

    @snc(defaultBoolean = false, name = "multiline")
    public final void setMultiline(ikc view, boolean multiline) {
        view.getClass();
        Companion companion = INSTANCE;
        int i = multiline ? 0 : 131072;
        int i2 = multiline ? 131072 : 0;
        companion.getClass();
        Companion.c(view, i, i2);
    }

    @snc(defaultInt = 1, name = "numberOfLines")
    public final void setNumLines(ikc view, int numLines) {
        view.getClass();
        view.setLines(numLines);
    }

    @snc(defaultBoolean = false, name = "onContentSizeChange")
    public final void setOnContentSizeChange(ikc view, boolean onContentSizeChange) {
        view.getClass();
        if (onContentSizeChange) {
            view.setContentSizeWatcher(new zoc(view));
        } else {
            view.setContentSizeWatcher(null);
        }
    }

    @snc(defaultBoolean = false, name = "onKeyPress")
    public final void setOnKeyPress(ikc view, boolean onKeyPress) {
        view.getClass();
        view.setOnKeyPress(onKeyPress);
    }

    @snc(defaultBoolean = false, name = "onScroll")
    public final void setOnScroll(ikc view, boolean onScroll) {
        view.getClass();
        if (onScroll) {
            view.setScrollWatcher(new kpc(view));
        } else {
            view.setScrollWatcher(null);
        }
    }

    @snc(defaultBoolean = false, name = "onSelectionChange")
    public final void setOnSelectionChange(ikc view, boolean onSelectionChange) {
        view.getClass();
        if (onSelectionChange) {
            view.setSelectionWatcher$ReactAndroid_release(new lpc(view));
        } else {
            view.setSelectionWatcher$ReactAndroid_release(null);
        }
    }

    @snc(name = "overflow")
    public final void setOverflow(ikc view, String overflow) {
        view.getClass();
        view.setOverflow(overflow);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void setPadding(ikc view, int left, int top, int right, int bottom) {
        view.getClass();
        view.setPadding(left, top, right, bottom);
    }

    @snc(name = "placeholder")
    public final void setPlaceholder(ikc view, String placeholder) {
        view.getClass();
        view.setPlaceholder(placeholder);
    }

    @snc(customType = "Color", name = "placeholderTextColor")
    public final void setPlaceholderTextColor(ikc view, Integer color) {
        view.getClass();
        if (color != null) {
            view.setHintTextColor(color.intValue());
            return;
        }
        Context context = view.getContext();
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.textColorHint});
        typedArrayObtainStyledAttributes.getClass();
        view.setHintTextColor(typedArrayObtainStyledAttributes.getColorStateList(0));
    }

    public final void setReactTextViewManagerCallback(ppc ppcVar) {
        this.reactTextViewManagerCallback = ppcVar;
    }

    @snc(name = "returnKeyLabel")
    public final void setReturnKeyLabel(ikc view, String returnKeyLabel) {
        view.getClass();
        view.setImeActionLabel(returnKeyLabel, IME_ACTION_ID);
    }

    @snc(name = "returnKeyType")
    public final void setReturnKeyType(ikc view, String returnKeyType) {
        view.getClass();
        view.setReturnKeyType(returnKeyType);
    }

    @snc(defaultBoolean = false, name = "secureTextEntry")
    public final void setSecureTextEntry(ikc view, boolean password) {
        view.getClass();
        Companion companion = INSTANCE;
        int i = password ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT : 0;
        companion.getClass();
        Companion.c(view, 144, i);
        Companion.a(companion, view);
    }

    @snc(defaultBoolean = false, name = "selectTextOnFocus")
    public final void setSelectTextOnFocus(ikc view, boolean selectTextOnFocus) {
        view.getClass();
        view.setSelectTextOnFocus(selectTextOnFocus);
    }

    @snc(customType = "Color", name = "selectionColor")
    public final void setSelectionColor(ikc view, Integer color) {
        view.getClass();
        if (color != null) {
            view.setHighlightColor(color.intValue());
            return;
        }
        Context context = view.getContext();
        context.getClass();
        view.setHighlightColor(pq3.a(context));
    }

    @snc(customType = "Color", name = "selectionHandleColor")
    public final void setSelectionHandleColor(ikc view, Integer color) {
        int i;
        view.getClass();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            Drawable textSelectHandle = view.getTextSelectHandle();
            Drawable drawableMutate = textSelectHandle != null ? textSelectHandle.mutate() : null;
            if (drawableMutate == null) {
                r6.g("Required value was null.");
                return;
            }
            Drawable textSelectHandleLeft = view.getTextSelectHandleLeft();
            Drawable drawableMutate2 = textSelectHandleLeft != null ? textSelectHandleLeft.mutate() : null;
            if (drawableMutate2 == null) {
                r6.g("Required value was null.");
                return;
            }
            Drawable textSelectHandleRight = view.getTextSelectHandleRight();
            Drawable drawableMutate3 = textSelectHandleRight != null ? textSelectHandleRight.mutate() : null;
            if (drawableMutate3 == null) {
                r6.g("Required value was null.");
                return;
            }
            if (color != null) {
                BlendModeColorFilter blendModeColorFilter = new BlendModeColorFilter(color.intValue(), BlendMode.SRC_IN);
                drawableMutate.setColorFilter(blendModeColorFilter);
                drawableMutate2.setColorFilter(blendModeColorFilter);
                drawableMutate3.setColorFilter(blendModeColorFilter);
            } else {
                drawableMutate.clearColorFilter();
                drawableMutate2.clearColorFilter();
                drawableMutate3.clearColorFilter();
            }
            view.setTextSelectHandle(drawableMutate);
            view.setTextSelectHandleLeft(drawableMutate2);
            view.setTextSelectHandleRight(drawableMutate3);
            return;
        }
        if (i2 == 28) {
            return;
        }
        int length = DRAWABLE_HANDLE_RESOURCES.length;
        for (int i3 = 0; i3 < length; i3++) {
            try {
                Field declaredField = ikc.class.getDeclaredField(DRAWABLE_HANDLE_RESOURCES[i3]);
                declaredField.setAccessible(true);
                i = declaredField.getInt(view);
            } catch (IllegalAccessException | NoSuchFieldException unused) {
            }
            if (i == 0) {
                return;
            }
            Drawable drawable = view.getContext().getDrawable(i);
            Drawable drawableMutate4 = drawable != null ? drawable.mutate() : null;
            if (drawableMutate4 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (color != null) {
                drawableMutate4.setColorFilter(color.intValue(), PorterDuff.Mode.SRC_IN);
            } else {
                drawableMutate4.clearColorFilter();
            }
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(view);
            if (obj == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Field declaredField3 = obj.getClass().getDeclaredField(DRAWABLE_HANDLE_FIELDS[i3]);
            declaredField3.setAccessible(true);
            declaredField3.set(obj, drawableMutate4);
        }
    }

    @snc(name = "submitBehavior")
    public final void setSubmitBehavior(ikc view, String submitBehavior) {
        view.getClass();
        view.setSubmitBehavior(submitBehavior);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        if (r5.equals("auto") == false) goto L26;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @android.annotation.SuppressLint({"WrongConstant"})
    @defpackage.snc(name = "textAlign")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setTextAlign(defpackage.ikc r4, java.lang.String r5) {
        /*
            r3 = this;
            r4.getClass()
            java.lang.String r3 = "justify"
            boolean r3 = r3.equals(r5)
            r0 = 3
            r1 = 1
            if (r3 == 0) goto L14
            r4.setJustificationMode(r1)
            r4.setGravityHorizontal$ReactAndroid_release(r0)
            return
        L14:
            r3 = 0
            r4.setJustificationMode(r3)
            if (r5 == 0) goto L61
            int r2 = r5.hashCode()
            switch(r2) {
                case -1364013995: goto L46;
                case 3005871: goto L3d;
                case 3317767: goto L30;
                case 108511772: goto L22;
                default: goto L21;
            }
        L21:
            goto L4e
        L22:
            java.lang.String r0 = "right"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L2b
            goto L4e
        L2b:
            r3 = 5
            r4.setGravityHorizontal$ReactAndroid_release(r3)
            return
        L30:
            java.lang.String r1 = "left"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L39
            goto L4e
        L39:
            r4.setGravityHorizontal$ReactAndroid_release(r0)
            return
        L3d:
            java.lang.String r0 = "auto"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L61
            goto L4e
        L46:
            java.lang.String r0 = "center"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L5d
        L4e:
            java.lang.String r0 = "Invalid textAlign: "
            java.lang.String r5 = r0.concat(r5)
            java.lang.String r0 = "ReactNative"
            defpackage.s55.n(r0, r5)
            r4.setGravityHorizontal$ReactAndroid_release(r3)
            return
        L5d:
            r4.setGravityHorizontal$ReactAndroid_release(r1)
            return
        L61:
            r4.setGravityHorizontal$ReactAndroid_release(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.textinput.ReactTextInputManager.setTextAlign(ikc, java.lang.String):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
    
        if (r3.equals("auto") == false) goto L22;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @defpackage.snc(name = "textAlignVertical")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setTextAlignVertical(defpackage.ikc r2, java.lang.String r3) {
        /*
            r1 = this;
            r2.getClass()
            r1 = 0
            if (r3 == 0) goto L52
            int r0 = r3.hashCode()
            switch(r0) {
                case -1383228885: goto L35;
                case -1364013995: goto L26;
                case 115029: goto L17;
                case 3005871: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L3d
        Le:
            java.lang.String r0 = "auto"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L52
            goto L3d
        L17:
            java.lang.String r0 = "top"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L20
            goto L3d
        L20:
            r1 = 48
            r2.setGravityVertical$ReactAndroid_release(r1)
            return
        L26:
            java.lang.String r0 = "center"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L2f
            goto L3d
        L2f:
            r1 = 16
            r2.setGravityVertical$ReactAndroid_release(r1)
            return
        L35:
            java.lang.String r0 = "bottom"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L4c
        L3d:
            java.lang.String r0 = "Invalid textAlignVertical: "
            java.lang.String r3 = r0.concat(r3)
            java.lang.String r0 = "ReactNative"
            defpackage.s55.n(r0, r3)
            r2.setGravityVertical$ReactAndroid_release(r1)
            return
        L4c:
            r1 = 80
            r2.setGravityVertical$ReactAndroid_release(r1)
            return
        L52:
            r2.setGravityVertical$ReactAndroid_release(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.textinput.ReactTextInputManager.setTextAlignVertical(ikc, java.lang.String):void");
    }

    @snc(name = "autoComplete")
    public final void setTextContentType(ikc view, String autoComplete) {
        view.getClass();
        if (autoComplete == null) {
            setImportantForAutofill(view, 2);
            return;
        }
        if ("off".equals(autoComplete)) {
            setImportantForAutofill(view, 2);
            return;
        }
        Map<String, String> map = REACT_PROPS_AUTOFILL_HINTS_MAP;
        if (!map.containsKey(autoComplete)) {
            s55.n("ReactNative", "Invalid autoComplete: ".concat(autoComplete));
            setImportantForAutofill(view, 2);
            return;
        }
        String[] strArr = new String[1];
        String str = map.get(autoComplete);
        if (str == null) {
            r6.g("Required value was null.");
        } else {
            strArr[0] = str;
            setAutofillHints(view, strArr);
        }
    }

    @snc(name = "textDecorationLine")
    public final void setTextDecorationLine(ikc view, String textDecorationLineString) {
        Collection collectionQ1;
        view.getClass();
        view.setPaintFlags(view.getPaintFlags() & (-25));
        if (textDecorationLineString == null) {
            return;
        }
        List<String> listG = new pxc(" ").g(textDecorationLineString, 0);
        if (listG.isEmpty()) {
            collectionQ1 = zr4.a;
        } else {
            ListIterator<String> listIterator = listG.listIterator(listG.size());
            while (listIterator.hasPrevious()) {
                if (listIterator.previous().length() != 0) {
                    collectionQ1 = z92.q1(listG, listIterator.nextIndex() + 1);
                    break;
                }
            }
            collectionQ1 = zr4.a;
        }
        for (String str : (String[]) collectionQ1.toArray(new String[0])) {
            if (wl7.b(str, "underline")) {
                view.setPaintFlags(view.getPaintFlags() | 8);
            } else if (wl7.b(str, "line-through")) {
                view.setPaintFlags(view.getPaintFlags() | 16);
            }
        }
    }

    @snc(customType = "Color", name = "underlineColorAndroid")
    public final void setUnderlineColor(ikc view, Integer underlineColor) {
        view.getClass();
        Drawable background = view.getBackground();
        if (background == null) {
            return;
        }
        if (background.getConstantState() != null) {
            try {
                Drawable drawableMutate = background.mutate();
                if (drawableMutate == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                background = drawableMutate;
            } catch (NullPointerException e) {
                s55.g(TAG, "NullPointerException when setting underlineColorAndroid for TextInput", e);
            }
        }
        if (underlineColor == null) {
            background.clearColorFilter();
        } else {
            background.setColorFilter(underlineColor.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @snc(defaultBoolean = true, name = "showSoftInputOnFocus")
    public final void showKeyboardOnFocus(ikc view, boolean showKeyboardOnFocus) {
        view.getClass();
        view.setShowSoftInputOnFocus(showKeyboardOnFocus);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(ikc view, Object extraData) {
        view.getClass();
        extraData.getClass();
        if (extraData instanceof npc) {
            npc npcVar = (npc) extraData;
            Spannable spannable = npcVar.a;
            int paddingLeft = (int) npcVar.d;
            int paddingTop = (int) npcVar.e;
            int paddingRight = (int) npcVar.f;
            int paddingBottom = (int) npcVar.g;
            int length = -1;
            if (paddingLeft != -1 || paddingTop != -1 || paddingRight != -1 || paddingBottom != -1) {
                if (paddingLeft == -1) {
                    paddingLeft = view.getPaddingLeft();
                }
                if (paddingTop == -1) {
                    paddingTop = view.getPaddingTop();
                }
                if (paddingRight == -1) {
                    paddingRight = view.getPaddingRight();
                }
                if (paddingBottom == -1) {
                    paddingBottom = view.getPaddingBottom();
                }
                view.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
            }
            if (npcVar.c) {
                int i = phf.a;
                phf.a.a(spannable, view);
            }
            if (view.getSelectionStart() == view.getSelectionEnd()) {
                Editable text = view.getText();
                length = spannable.length() - ((text != null ? text.length() : 0) - view.getSelectionStart());
            }
            int i2 = length;
            view.g(npcVar);
            if (npcVar.b >= view.d0) {
                view.f(length, i2);
            }
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(ikc view, noc props, vse stateWrapper) {
        view.getClass();
        props.getClass();
        stateWrapper.getClass();
        QwertyKeyListener qwertyKeyListener = ikc.G0;
        if (view.getStateWrapper() == null) {
            view.setPadding(0, 0, 0, 0);
        }
        view.setStateWrapper(stateWrapper);
        ReadableMapBuffer stateDataMapBuffer = stateWrapper.getStateDataMapBuffer();
        if (stateDataMapBuffer != null) {
            return getReactTextUpdate(view, props, stateDataMapBuffer);
        }
        return null;
    }

    public final rjc createShadowNodeInstance(ppc reactTextViewManagerCallback) {
        return new gpc(reactTextViewManagerCallback);
    }

    private final void setImportantForAutofill(ikc view, int mode) {
        view.setImportantForAutofill(mode);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @sy3
    public void receiveCommand(ikc reactEditText, int commandId, ReadableArray args) {
        reactEditText.getClass();
        if (commandId == 1) {
            receiveCommand(reactEditText, "focus", args);
        } else if (commandId == 2) {
            receiveCommand(reactEditText, "blur", args);
        } else {
            if (commandId != 4) {
                return;
            }
            receiveCommand(reactEditText, "setTextAndSelection", args);
        }
    }

    private final npc getReactTextUpdate(String text, int mostRecentEventCount) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) text);
        return new npc(spannableStringBuilder, mostRecentEventCount, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0);
    }
}
