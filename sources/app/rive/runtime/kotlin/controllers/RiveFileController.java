package app.rive.runtime.kotlin.controllers;

import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Log;
import app.rive.runtime.kotlin.ChangedInput;
import app.rive.runtime.kotlin.Observable;
import app.rive.runtime.kotlin.RiveAnimationView;
import app.rive.runtime.kotlin.core.AdvanceResult;
import app.rive.runtime.kotlin.core.Alignment;
import app.rive.runtime.kotlin.core.Artboard;
import app.rive.runtime.kotlin.core.Direction;
import app.rive.runtime.kotlin.core.File;
import app.rive.runtime.kotlin.core.Fit;
import app.rive.runtime.kotlin.core.Helpers;
import app.rive.runtime.kotlin.core.LayerState;
import app.rive.runtime.kotlin.core.LinearAnimationInstance;
import app.rive.runtime.kotlin.core.Loop;
import app.rive.runtime.kotlin.core.PlayableInstance;
import app.rive.runtime.kotlin.core.RefCount;
import app.rive.runtime.kotlin.core.RiveEvent;
import app.rive.runtime.kotlin.core.SMIBoolean;
import app.rive.runtime.kotlin.core.SMIInput;
import app.rive.runtime.kotlin.core.SMINumber;
import app.rive.runtime.kotlin.core.SMITrigger;
import app.rive.runtime.kotlin.core.StateMachineInstance;
import app.rive.runtime.kotlin.core.ViewModelInstance;
import app.rive.runtime.kotlin.core.errors.StateMachineException;
import app.rive.runtime.kotlin.core.errors.TextValueRunException;
import app.rive.runtime.kotlin.core.errors.ViewModelException;
import app.rive.runtime.kotlin.renderers.PointerEvents;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.gu5;
import defpackage.j6g;
import defpackage.l5;
import defpackage.q6;
import defpackage.u63;
import defpackage.w92;
import defpackage.wl7;
import defpackage.z92;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0098\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 \u0090\u00022\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006\u0090\u0002\u0091\u0002\u0092\u0002B]\b\u0000\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0018\u00010\fj\u0004\u0018\u0001`\u000e\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014BM\b\u0016\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0018\u00010\fj\u0004\u0018\u0001`\u000e¢\u0006\u0004\b\u0013\u0010\u0015J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\"\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u00020\r2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b%\u0010&J\r\u0010\u0007\u001a\u00020\r¢\u0006\u0004\b\u0007\u0010'J\u0017\u0010,\u001a\u00020\r2\u0006\u0010)\u001a\u00020(H\u0000¢\u0006\u0004\b*\u0010+JC\u00103\u001a\u00020\r2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020 0-2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u00100\u001a\u00020/2\b\b\u0002\u00101\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u0006¢\u0006\u0004\b3\u00104J=\u00103\u001a\u00020\r2\u0006\u00105\u001a\u00020 2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u00100\u001a\u00020/2\b\b\u0002\u00106\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u0006¢\u0006\u0004\b3\u00107J+\u00103\u001a\u00020\r2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u00100\u001a\u00020/2\b\b\u0002\u00102\u001a\u00020\u0006¢\u0006\u0004\b3\u00108J\r\u00109\u001a\u00020\r¢\u0006\u0004\b9\u0010'J%\u00109\u001a\u00020\r2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020 0-2\b\b\u0002\u00101\u001a\u00020\u0006¢\u0006\u0004\b9\u0010:J\u001f\u00109\u001a\u00020\r2\u0006\u00105\u001a\u00020 2\b\b\u0002\u00106\u001a\u00020\u0006¢\u0006\u0004\b9\u0010;J\r\u0010<\u001a\u00020\r¢\u0006\u0004\b<\u0010'J%\u0010<\u001a\u00020\r2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020 0-2\b\b\u0002\u00101\u001a\u00020\u0006¢\u0006\u0004\b<\u0010:J\u001f\u0010<\u001a\u00020\r2\u0006\u00105\u001a\u00020 2\b\b\u0002\u00106\u001a\u00020\u0006¢\u0006\u0004\b<\u0010;J#\u0010A\u001a\u00020\r2\u0012\u0010>\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110=\"\u00020\u0011H\u0000¢\u0006\u0004\b?\u0010@J)\u0010E\u001a\u00020\r2\u0006\u0010B\u001a\u00020 2\u0006\u0010C\u001a\u00020 2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010 ¢\u0006\u0004\bE\u0010FJ1\u0010H\u001a\u00020\r2\u0006\u0010B\u001a\u00020 2\u0006\u0010C\u001a\u00020 2\u0006\u0010G\u001a\u00020\u00062\n\b\u0002\u0010D\u001a\u0004\u0018\u00010 ¢\u0006\u0004\bH\u0010IJ1\u0010J\u001a\u00020\r2\u0006\u0010B\u001a\u00020 2\u0006\u0010C\u001a\u00020 2\u0006\u0010G\u001a\u00020\u001c2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010 ¢\u0006\u0004\bJ\u0010KJ\u001d\u0010L\u001a\u00020\r2\u0006\u0010C\u001a\u00020 2\u0006\u0010D\u001a\u00020 ¢\u0006\u0004\bL\u0010MJ%\u0010N\u001a\u00020\r2\u0006\u0010C\u001a\u00020 2\u0006\u0010G\u001a\u00020\u00062\u0006\u0010D\u001a\u00020 ¢\u0006\u0004\bN\u0010OJ%\u0010P\u001a\u00020\r2\u0006\u0010C\u001a\u00020 2\u0006\u0010G\u001a\u00020\u001c2\u0006\u0010D\u001a\u00020 ¢\u0006\u0004\bP\u0010QJ\u0017\u0010S\u001a\u0004\u0018\u00010 2\u0006\u0010R\u001a\u00020 ¢\u0006\u0004\bS\u0010TJ\u001f\u0010S\u001a\u0004\u0018\u00010 2\u0006\u0010R\u001a\u00020 2\u0006\u0010D\u001a\u00020 ¢\u0006\u0004\bS\u0010UJ\u001d\u0010W\u001a\u00020\r2\u0006\u0010R\u001a\u00020 2\u0006\u0010V\u001a\u00020 ¢\u0006\u0004\bW\u0010MJ%\u0010W\u001a\u00020\r2\u0006\u0010R\u001a\u00020 2\u0006\u0010V\u001a\u00020 2\u0006\u0010D\u001a\u00020 ¢\u0006\u0004\bW\u0010FJ\u000f\u0010X\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\bX\u0010YJ\u0015\u0010Z\u001a\u00020\r2\u0006\u0010G\u001a\u00020\u001c¢\u0006\u0004\bZ\u0010\u001fJ!\u00103\u001a\u00020\r2\u0006\u0010\\\u001a\u00020[2\b\b\u0002\u0010]\u001a\u00020\u0006H\u0000¢\u0006\u0004\b^\u0010_J'\u00103\u001a\u00020\r2\u0006\u0010a\u001a\u00020`2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00100\u001a\u00020/H\u0000¢\u0006\u0004\b^\u0010bJ%\u0010g\u001a\u00020\r2\u0006\u0010d\u001a\u00020c2\u0006\u0010e\u001a\u00020\u001c2\u0006\u0010f\u001a\u00020\u001c¢\u0006\u0004\bg\u0010hJ\u0017\u0010j\u001a\u00020\r2\u0006\u0010i\u001a\u00020\u0002H\u0016¢\u0006\u0004\bj\u0010kJ\u0017\u0010l\u001a\u00020\r2\u0006\u0010i\u001a\u00020\u0002H\u0016¢\u0006\u0004\bl\u0010kJ\u0015\u0010n\u001a\u00020\r2\u0006\u0010i\u001a\u00020m¢\u0006\u0004\bn\u0010oJ\u0015\u0010p\u001a\u00020\r2\u0006\u0010i\u001a\u00020m¢\u0006\u0004\bp\u0010oJ\u000f\u0010r\u001a\u00020\rH\u0000¢\u0006\u0004\bq\u0010'J\u000f\u0010t\u001a\u00020sH\u0016¢\u0006\u0004\bt\u0010uJ\u0017\u0010w\u001a\u00020\r2\u0006\u0010v\u001a\u00020\nH\u0002¢\u0006\u0004\bw\u0010xJ7\u0010z\u001a\u00020\r2\u0006\u0010B\u001a\u00020 2\u0006\u0010C\u001a\u00020 2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010y2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\bz\u0010{J\u000f\u0010|\u001a\u00020\rH\u0003¢\u0006\u0004\b|\u0010'J\u001d\u0010}\u001a\b\u0012\u0004\u0012\u00020`0-2\u0006\u00105\u001a\u00020 H\u0002¢\u0006\u0004\b}\u0010~J\u001d\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020[0-2\u0006\u00105\u001a\u00020 H\u0002¢\u0006\u0004\b\u007f\u0010~J%\u0010}\u001a\b\u0012\u0004\u0012\u00020`0-2\r\u0010.\u001a\t\u0012\u0004\u0012\u00020 0\u0080\u0001H\u0002¢\u0006\u0005\b}\u0010\u0081\u0001J%\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020[0-2\r\u0010.\u001a\t\u0012\u0004\u0012\u00020 0\u0080\u0001H\u0002¢\u0006\u0005\b\u007f\u0010\u0081\u0001J\u001f\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020[0-2\u0006\u00105\u001a\u00020 H\u0002¢\u0006\u0005\b\u0082\u0001\u0010~JA\u0010\u0083\u0001\u001a\u00020\r2\u0006\u00105\u001a\u00020 2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u00100\u001a\u00020/2\b\b\u0002\u00106\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u0083\u0001\u00107J\"\u0010\u0084\u0001\u001a\u00020\u00062\u0006\u0010\\\u001a\u00020[2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u0019\u00109\u001a\u00020\r2\u0007\u0010\u0086\u0001\u001a\u00020`H\u0002¢\u0006\u0005\b9\u0010\u0087\u0001J\u0019\u00109\u001a\u00020\r2\u0007\u0010\u0088\u0001\u001a\u00020[H\u0002¢\u0006\u0005\b9\u0010\u0089\u0001J\u001b\u0010\u008a\u0001\u001a\u00020\r2\u0007\u0010\u0086\u0001\u001a\u00020`H\u0002¢\u0006\u0006\b\u008a\u0001\u0010\u0087\u0001J\u001b\u0010\u008a\u0001\u001a\u00020\r2\u0007\u0010\u0088\u0001\u001a\u00020[H\u0002¢\u0006\u0006\b\u008a\u0001\u0010\u0089\u0001J\u001c\u0010\u008d\u0001\u001a\u00020\r2\b\u0010\u008c\u0001\u001a\u00030\u008b\u0001H\u0002¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u001c\u0010\u008f\u0001\u001a\u00020\r2\b\u0010\u008c\u0001\u001a\u00030\u008b\u0001H\u0002¢\u0006\u0006\b\u008f\u0001\u0010\u008e\u0001J\u001c\u0010\u0090\u0001\u001a\u00020\r2\b\u0010\u008c\u0001\u001a\u00030\u008b\u0001H\u0002¢\u0006\u0006\b\u0090\u0001\u0010\u008e\u0001J\u001c\u0010\u0091\u0001\u001a\u00020\r2\b\u0010\u008c\u0001\u001a\u00030\u008b\u0001H\u0002¢\u0006\u0006\b\u0091\u0001\u0010\u008e\u0001J\u0019\u0010\u0092\u0001\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001cH\u0003¢\u0006\u0005\b\u0092\u0001\u0010\u001fJ$\u0010\u0094\u0001\u001a\u00020\r2\u0007\u0010\u0088\u0001\u001a\u00020[2\u0007\u0010\u0019\u001a\u00030\u0093\u0001H\u0002¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u001c\u0010\u0098\u0001\u001a\u00020\r2\b\u0010\u0097\u0001\u001a\u00030\u0096\u0001H\u0002¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001R'\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0005\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R'\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0007\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001\"\u0006\b¢\u0001\u0010£\u0001R5\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0018\u00010\fj\u0004\u0018\u0001`\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u000f\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R#\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0001X\u0080\u0004¢\u0006\u000f\n\u0005\b\u0012\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001R*\u0010\u00ad\u0001\u001a\u00030¬\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b\u00ad\u0001\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001\"\u0006\b±\u0001\u0010²\u0001R)\u0010³\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b³\u0001\u0010\u009f\u0001\u001a\u0006\b³\u0001\u0010¡\u0001\"\u0006\b´\u0001\u0010£\u0001R*\u0010¶\u0001\u001a\u00030µ\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¶\u0001\u0010·\u0001\u001a\u0006\b¸\u0001\u0010¹\u0001\"\u0006\bº\u0001\u0010»\u0001R3\u0010½\u0001\u001a\u00030¼\u00012\u0007\u0010G\u001a\u00030¼\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b½\u0001\u0010¾\u0001\u001a\u0006\b¿\u0001\u0010À\u0001\"\u0006\bÁ\u0001\u0010Â\u0001R3\u0010Ä\u0001\u001a\u00030Ã\u00012\u0007\u0010G\u001a\u00030Ã\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bÄ\u0001\u0010Å\u0001\u001a\u0006\bÆ\u0001\u0010Ç\u0001\"\u0006\bÈ\u0001\u0010É\u0001R4\u0010Ê\u0001\u001a\u0004\u0018\u00010\u001c2\b\u0010G\u001a\u0004\u0018\u00010\u001c8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\bÊ\u0001\u0010Ë\u0001\u001a\u0005\bÌ\u0001\u0010Y\"\u0006\bÍ\u0001\u0010Î\u0001R0\u0010Ï\u0001\u001a\u00020\u001c2\u0006\u0010G\u001a\u00020\u001c8\u0006@@X\u0086\u000e¢\u0006\u0017\n\u0006\bÏ\u0001\u0010Ð\u0001\u001a\u0006\bÑ\u0001\u0010Ò\u0001\"\u0005\bÓ\u0001\u0010\u001fR3\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010G\u001a\u0004\u0018\u00010\b8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\b\t\u0010Ô\u0001\u001a\u0006\bÕ\u0001\u0010Ö\u0001\"\u0006\b×\u0001\u0010Ø\u0001R2\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010G\u001a\u0004\u0018\u00010\n8\u0006@FX\u0086\u000e¢\u0006\u0016\n\u0005\b\u000b\u0010Ù\u0001\u001a\u0006\bÚ\u0001\u0010Û\u0001\"\u0005\bÜ\u0001\u0010xRA\u0010ß\u0001\u001a*\u0012\r\u0012\u000b Þ\u0001*\u0004\u0018\u00010`0` Þ\u0001*\u0013\u0012\r\u0012\u000b Þ\u0001*\u0004\u0018\u00010`0`\u0018\u00010-0Ý\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bß\u0001\u0010à\u0001RA\u0010á\u0001\u001a*\u0012\r\u0012\u000b Þ\u0001*\u0004\u0018\u00010[0[ Þ\u0001*\u0013\u0012\r\u0012\u000b Þ\u0001*\u0004\u0018\u00010[0[\u0018\u00010-0Ý\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bá\u0001\u0010à\u0001RB\u0010ä\u0001\u001a+\u0012\r\u0012\u000b Þ\u0001*\u0004\u0018\u00010`0` Þ\u0001*\u0014\u0012\r\u0012\u000b Þ\u0001*\u0004\u0018\u00010`0`\u0018\u00010ã\u00010â\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bä\u0001\u0010å\u0001RB\u0010æ\u0001\u001a+\u0012\r\u0012\u000b Þ\u0001*\u0004\u0018\u00010[0[ Þ\u0001*\u0014\u0012\r\u0012\u000b Þ\u0001*\u0004\u0018\u00010[0[\u0018\u00010ã\u00010â\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bæ\u0001\u0010å\u0001R \u0010è\u0001\u001a\u00030ç\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bè\u0001\u0010é\u0001\u001a\u0006\bê\u0001\u0010ë\u0001R*\u0010í\u0001\u001a\u00030ì\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bí\u0001\u0010î\u0001\u001a\u0006\bï\u0001\u0010ð\u0001\"\u0006\bñ\u0001\u0010ò\u0001R\u001b\u0010ó\u0001\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bó\u0001\u0010Ë\u0001R \u0010ô\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020â\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bô\u0001\u0010å\u0001R \u0010õ\u0001\u001a\t\u0012\u0004\u0012\u00020m0â\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bõ\u0001\u0010å\u0001R\u0017\u0010÷\u0001\u001a\u00020\u001c8@X\u0080\u0004¢\u0006\b\u001a\u0006\bö\u0001\u0010Ò\u0001R\u0019\u0010}\u001a\b\u0012\u0004\u0012\u00020`0-8F¢\u0006\b\u001a\u0006\bø\u0001\u0010ù\u0001R\u0019\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020[0-8F¢\u0006\b\u001a\u0006\bú\u0001\u0010ù\u0001R&\u0010ÿ\u0001\u001a\u0014\u0012\u0004\u0012\u00020`0û\u0001j\t\u0012\u0004\u0012\u00020``ü\u00018F¢\u0006\b\u001a\u0006\bý\u0001\u0010þ\u0001R&\u0010\u0081\u0002\u001a\u0014\u0012\u0004\u0012\u00020[0û\u0001j\t\u0012\u0004\u0012\u00020[`ü\u00018F¢\u0006\b\u001a\u0006\b\u0080\u0002\u0010þ\u0001R\u001b\u0010\u0084\u0002\u001a\t\u0012\u0004\u0012\u00020`0ã\u00018F¢\u0006\b\u001a\u0006\b\u0082\u0002\u0010\u0083\u0002R\u001b\u0010\u0086\u0002\u001a\t\u0012\u0004\u0012\u00020[0ã\u00018F¢\u0006\b\u001a\u0006\b\u0085\u0002\u0010\u0083\u0002R\u0014\u0010\u0087\u0002\u001a\u00020\u00068F¢\u0006\b\u001a\u0006\b\u0087\u0002\u0010¡\u0001R\u0015\u0010\u0089\u0002\u001a\u00030ì\u00018F¢\u0006\b\u001a\u0006\b\u0088\u0002\u0010ð\u0001R0\u0010\u008c\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u00020û\u0001j\t\u0012\u0004\u0012\u00020\u0002`ü\u00018FX\u0087\u0004¢\u0006\u000f\u0012\u0005\b\u008b\u0002\u0010'\u001a\u0006\b\u008a\u0002\u0010þ\u0001R0\u0010\u008f\u0002\u001a\u0014\u0012\u0004\u0012\u00020m0û\u0001j\t\u0012\u0004\u0012\u00020m`ü\u00018FX\u0087\u0004¢\u0006\u000f\u0012\u0005\b\u008e\u0002\u0010'\u001a\u0006\b\u008d\u0002\u0010þ\u0001¨\u0006\u0093\u0002"}, d2 = {"Lapp/rive/runtime/kotlin/controllers/RiveFileController;", "Lapp/rive/runtime/kotlin/Observable;", "Lapp/rive/runtime/kotlin/controllers/RiveFileController$Listener;", "Lapp/rive/runtime/kotlin/core/RefCount;", "Lapp/rive/runtime/kotlin/core/Loop;", "loop", "", "autoplay", "Lapp/rive/runtime/kotlin/core/File;", "file", "Lapp/rive/runtime/kotlin/core/Artboard;", "activeArtboard", "Lkotlin/Function0;", "Lj6g;", "Lapp/rive/runtime/kotlin/controllers/OnStartCallback;", "onStart", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lapp/rive/runtime/kotlin/ChangedInput;", "changedInputs", "<init>", "(Lapp/rive/runtime/kotlin/core/Loop;ZLapp/rive/runtime/kotlin/core/File;Lapp/rive/runtime/kotlin/core/Artboard;Lgu5;Ljava/util/concurrent/ConcurrentLinkedQueue;)V", "(Lapp/rive/runtime/kotlin/core/Loop;ZLapp/rive/runtime/kotlin/core/File;Lapp/rive/runtime/kotlin/core/Artboard;Lgu5;)V", "Lapp/rive/runtime/kotlin/controllers/ControllerState;", "saveControllerState", "()Lapp/rive/runtime/kotlin/controllers/ControllerState;", "state", "restoreControllerState", "(Lapp/rive/runtime/kotlin/controllers/ControllerState;)V", "", "elapsed", "advance", "(F)V", "", "artboardName", "setRiveFile", "(Lapp/rive/runtime/kotlin/core/File;Ljava/lang/String;)V", "name", "selectArtboard", "(Ljava/lang/String;)V", "()V", "Lapp/rive/runtime/kotlin/RiveAnimationView$RendererAttributes;", "rendererAttributes", "setupScene$kotlin_release", "(Lapp/rive/runtime/kotlin/RiveAnimationView$RendererAttributes;)V", "setupScene", "", "animationNames", "Lapp/rive/runtime/kotlin/core/Direction;", "direction", "areStateMachines", "settleInitialState", "play", "(Ljava/util/List;Lapp/rive/runtime/kotlin/core/Loop;Lapp/rive/runtime/kotlin/core/Direction;ZZ)V", "animationName", "isStateMachine", "(Ljava/lang/String;Lapp/rive/runtime/kotlin/core/Loop;Lapp/rive/runtime/kotlin/core/Direction;ZZ)V", "(Lapp/rive/runtime/kotlin/core/Loop;Lapp/rive/runtime/kotlin/core/Direction;Z)V", "pause", "(Ljava/util/List;Z)V", "(Ljava/lang/String;Z)V", "stopAnimations", "", "inputs", "queueInputs$kotlin_release", "([Lapp/rive/runtime/kotlin/ChangedInput;)V", "queueInputs", "stateMachineName", "inputName", "path", "fireState", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "value", "setBooleanState", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "setNumberState", "(Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;)V", "fireStateAtPath", "(Ljava/lang/String;Ljava/lang/String;)V", "setBooleanStateAtPath", "(Ljava/lang/String;ZLjava/lang/String;)V", "setNumberStateAtPath", "(Ljava/lang/String;FLjava/lang/String;)V", "textRunName", "getTextRunValue", "(Ljava/lang/String;)Ljava/lang/String;", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "textValue", "setTextRunValue", "getVolume", "()Ljava/lang/Float;", "setVolume", "Lapp/rive/runtime/kotlin/core/StateMachineInstance;", "stateMachineInstance", "settleStateMachineState", "play$kotlin_release", "(Lapp/rive/runtime/kotlin/core/StateMachineInstance;Z)V", "Lapp/rive/runtime/kotlin/core/LinearAnimationInstance;", "animationInstance", "(Lapp/rive/runtime/kotlin/core/LinearAnimationInstance;Lapp/rive/runtime/kotlin/core/Loop;Lapp/rive/runtime/kotlin/core/Direction;)V", "Lapp/rive/runtime/kotlin/renderers/PointerEvents;", "eventType", "x", "y", "pointerEvent", "(Lapp/rive/runtime/kotlin/renderers/PointerEvents;FF)V", "listener", "registerListener", "(Lapp/rive/runtime/kotlin/controllers/RiveFileController$Listener;)V", "unregisterListener", "Lapp/rive/runtime/kotlin/controllers/RiveFileController$RiveEventListener;", "addEventListener", "(Lapp/rive/runtime/kotlin/controllers/RiveFileController$RiveEventListener;)V", "removeEventListener", "reset$kotlin_release", "reset", "", "release", "()I", "ab", "setArtboard", "(Lapp/rive/runtime/kotlin/core/Artboard;)V", "", "queueInput", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V", "processAllInputs", "animations", "(Ljava/lang/String;)Ljava/util/List;", "stateMachines", "", "(Ljava/util/Collection;)Ljava/util/List;", "getOrCreateStateMachines", "playAnimation", "resolveStateMachineAdvance", "(Lapp/rive/runtime/kotlin/core/StateMachineInstance;F)Z", "animation", "(Lapp/rive/runtime/kotlin/core/LinearAnimationInstance;)V", "stateMachine", "(Lapp/rive/runtime/kotlin/core/StateMachineInstance;)V", "stop", "Lapp/rive/runtime/kotlin/core/PlayableInstance;", "playableInstance", "notifyPlay", "(Lapp/rive/runtime/kotlin/core/PlayableInstance;)V", "notifyPause", "notifyStop", "notifyLoop", "notifyAdvance", "Lapp/rive/runtime/kotlin/core/LayerState;", "notifyStateChanged", "(Lapp/rive/runtime/kotlin/core/StateMachineInstance;Lapp/rive/runtime/kotlin/core/LayerState;)V", "Lapp/rive/runtime/kotlin/core/RiveEvent;", "event", "notifyEvent", "(Lapp/rive/runtime/kotlin/core/RiveEvent;)V", "Lapp/rive/runtime/kotlin/core/Loop;", "getLoop", "()Lapp/rive/runtime/kotlin/core/Loop;", "setLoop", "(Lapp/rive/runtime/kotlin/core/Loop;)V", "Z", "getAutoplay", "()Z", "setAutoplay", "(Z)V", "Lgu5;", "getOnStart", "()Lgu5;", "setOnStart", "(Lgu5;)V", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "getChangedInputs$kotlin_release", "()Ljava/util/concurrent/ConcurrentLinkedQueue;", "Ljava/util/concurrent/atomic/AtomicInteger;", "refs", "Ljava/util/concurrent/atomic/AtomicInteger;", "getRefs", "()Ljava/util/concurrent/atomic/AtomicInteger;", "setRefs", "(Ljava/util/concurrent/atomic/AtomicInteger;)V", "isActive", "setActive", "Ljava/util/concurrent/atomic/AtomicBoolean;", "requireArtboardResize", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getRequireArtboardResize$kotlin_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "setRequireArtboardResize$kotlin_release", "(Ljava/util/concurrent/atomic/AtomicBoolean;)V", "Lapp/rive/runtime/kotlin/core/Fit;", "fit", "Lapp/rive/runtime/kotlin/core/Fit;", "getFit", "()Lapp/rive/runtime/kotlin/core/Fit;", "setFit", "(Lapp/rive/runtime/kotlin/core/Fit;)V", "Lapp/rive/runtime/kotlin/core/Alignment;", "alignment", "Lapp/rive/runtime/kotlin/core/Alignment;", "getAlignment", "()Lapp/rive/runtime/kotlin/core/Alignment;", "setAlignment", "(Lapp/rive/runtime/kotlin/core/Alignment;)V", "layoutScaleFactor", "Ljava/lang/Float;", "getLayoutScaleFactor", "setLayoutScaleFactor", "(Ljava/lang/Float;)V", "layoutScaleFactorAutomatic", "F", "getLayoutScaleFactorAutomatic", "()F", "setLayoutScaleFactorAutomatic$kotlin_release", "Lapp/rive/runtime/kotlin/core/File;", "getFile", "()Lapp/rive/runtime/kotlin/core/File;", "setFile", "(Lapp/rive/runtime/kotlin/core/File;)V", "Lapp/rive/runtime/kotlin/core/Artboard;", "getActiveArtboard", "()Lapp/rive/runtime/kotlin/core/Artboard;", "setActiveArtboard", "", "kotlin.jvm.PlatformType", "animationList", "Ljava/util/List;", "stateMachineList", "", "", "playingAnimationSet", "Ljava/util/Set;", "playingStateMachineSet", "Ljava/util/concurrent/locks/ReentrantLock;", "startStopLock", "Ljava/util/concurrent/locks/ReentrantLock;", "getStartStopLock$kotlin_release", "()Ljava/util/concurrent/locks/ReentrantLock;", "Landroid/graphics/RectF;", "targetBounds", "Landroid/graphics/RectF;", "getTargetBounds", "()Landroid/graphics/RectF;", "setTargetBounds", "(Landroid/graphics/RectF;)V", "userSetVolume", "_listeners", "_eventListeners", "getLayoutScaleFactorActive$kotlin_release", "layoutScaleFactorActive", "getAnimations", "()Ljava/util/List;", "getStateMachines", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "getPlayingAnimations", "()Ljava/util/HashSet;", "playingAnimations", "getPlayingStateMachines", "playingStateMachines", "getPausedAnimations", "()Ljava/util/Set;", "pausedAnimations", "getPausedStateMachines", "pausedStateMachines", "isAdvancing", "getArtboardBounds", "artboardBounds", "getListeners", "getListeners$annotations", "listeners", "getEventListeners", "getEventListeners$annotations", "eventListeners", "Companion", "Listener", "RiveEventListener", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public final class RiveFileController implements Observable<Listener>, RefCount {
    public static final String TAG = "RiveFileController";
    private Set<RiveEventListener> _eventListeners;
    private Set<Listener> _listeners;
    private Artboard activeArtboard;
    private Alignment alignment;
    private List<LinearAnimationInstance> animationList;
    private boolean autoplay;
    private final ConcurrentLinkedQueue<ChangedInput> changedInputs;
    private File file;
    private Fit fit;
    private boolean isActive;
    private Float layoutScaleFactor;
    private float layoutScaleFactorAutomatic;
    private Loop loop;
    private gu5<j6g> onStart;
    private Set<LinearAnimationInstance> playingAnimationSet;
    private Set<StateMachineInstance> playingStateMachineSet;
    private AtomicInteger refs;
    private AtomicBoolean requireArtboardResize;
    private final ReentrantLock startStopLock;
    private List<StateMachineInstance> stateMachineList;
    private RectF targetBounds;
    private Float userSetVolume;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0006J\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lapp/rive/runtime/kotlin/controllers/RiveFileController$Listener;", "", "Lapp/rive/runtime/kotlin/core/PlayableInstance;", "animation", "Lj6g;", "notifyPlay", "(Lapp/rive/runtime/kotlin/core/PlayableInstance;)V", "notifyPause", "notifyStop", "notifyLoop", "", "stateMachineName", "stateName", "notifyStateChanged", "(Ljava/lang/String;Ljava/lang/String;)V", "", "elapsed", "notifyAdvance", "(F)V", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
    public interface Listener {

        @Metadata(k = 3, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
        public static final class DefaultImpls {
            public static void notifyAdvance(Listener listener, float f) {
            }
        }

        void notifyAdvance(float elapsed);

        void notifyLoop(PlayableInstance animation);

        void notifyPause(PlayableInstance animation);

        void notifyPlay(PlayableInstance animation);

        void notifyStateChanged(String stateMachineName, String stateName);

        void notifyStop(PlayableInstance animation);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lapp/rive/runtime/kotlin/controllers/RiveFileController$RiveEventListener;", "", "Lapp/rive/runtime/kotlin/core/RiveEvent;", "event", "Lj6g;", "notifyEvent", "(Lapp/rive/runtime/kotlin/core/RiveEvent;)V", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
    public interface RiveEventListener {
        void notifyEvent(RiveEvent event);
    }

    @Metadata(k = 3, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AdvanceResult.values().length];
            try {
                iArr[AdvanceResult.ONESHOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdvanceResult.LOOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdvanceResult.PINGPONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdvanceResult.ADVANCED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AdvanceResult.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PointerEvents.values().length];
            try {
                iArr2[PointerEvents.POINTER_DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PointerEvents.POINTER_UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[PointerEvents.POINTER_MOVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public RiveFileController(Loop loop, boolean z, File file, Artboard artboard, gu5<j6g> gu5Var, ConcurrentLinkedQueue<ChangedInput> concurrentLinkedQueue) {
        loop.getClass();
        concurrentLinkedQueue.getClass();
        this.loop = loop;
        this.autoplay = z;
        this.onStart = gu5Var;
        this.changedInputs = concurrentLinkedQueue;
        this.refs = new AtomicInteger(1);
        this.requireArtboardResize = new AtomicBoolean(false);
        this.fit = Fit.CONTAIN;
        this.alignment = Alignment.CENTER;
        this.layoutScaleFactorAutomatic = 1.0f;
        this.file = file;
        this.activeArtboard = artboard;
        this.animationList = Collections.synchronizedList(new ArrayList());
        this.stateMachineList = Collections.synchronizedList(new ArrayList());
        this.playingAnimationSet = Collections.synchronizedSet(new HashSet());
        this.playingStateMachineSet = Collections.synchronizedSet(new HashSet());
        this.startStopLock = new ReentrantLock();
        this.targetBounds = new RectF();
        Set<Listener> setSynchronizedSet = Collections.synchronizedSet(new HashSet());
        setSynchronizedSet.getClass();
        this._listeners = setSynchronizedSet;
        Set<RiveEventListener> setSynchronizedSet2 = Collections.synchronizedSet(new HashSet());
        setSynchronizedSet2.getClass();
        this._eventListeners = setSynchronizedSet2;
    }

    private final List<LinearAnimationInstance> animations(Collection<String> animationNames) {
        List<LinearAnimationInstance> animations = getAnimations();
        ArrayList arrayList = new ArrayList();
        for (Object obj : animations) {
            if (animationNames.contains(((LinearAnimationInstance) obj).getName())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void fireState$default(RiveFileController riveFileController, String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        riveFileController.fireState(str, str2, str3);
    }

    public static /* synthetic */ void getEventListeners$annotations() {
    }

    public static /* synthetic */ void getListeners$annotations() {
    }

    private final List<StateMachineInstance> getOrCreateStateMachines(String animationName) throws StateMachineException {
        Artboard artboard;
        List<StateMachineInstance> listStateMachines = stateMachines(animationName);
        if (!listStateMachines.isEmpty() || (artboard = this.activeArtboard) == null) {
            return listStateMachines;
        }
        StateMachineInstance stateMachineInstanceStateMachine = artboard.stateMachine(animationName);
        this.stateMachineList.add(stateMachineInstanceStateMachine);
        return u63.Z(stateMachineInstanceStateMachine);
    }

    private final void notifyAdvance(float elapsed) {
        Iterator it = z92.z1(getListeners()).iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).notifyAdvance(elapsed);
        }
    }

    private final void notifyEvent(RiveEvent event) {
        Iterator it = z92.z1(getEventListeners()).iterator();
        while (it.hasNext()) {
            ((RiveEventListener) it.next()).notifyEvent(event);
        }
    }

    private final void notifyLoop(PlayableInstance playableInstance) {
        Iterator it = z92.z1(getListeners()).iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).notifyLoop(playableInstance);
        }
    }

    private final void notifyPause(PlayableInstance playableInstance) {
        Iterator it = z92.z1(getListeners()).iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).notifyPause(playableInstance);
        }
    }

    private final void notifyPlay(PlayableInstance playableInstance) {
        Iterator it = z92.z1(getListeners()).iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).notifyPlay(playableInstance);
        }
    }

    private final void notifyStateChanged(StateMachineInstance stateMachine, LayerState state) {
        Iterator it = z92.z1(getListeners()).iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).notifyStateChanged(stateMachine.getName(), state.toString());
        }
    }

    private final void notifyStop(PlayableInstance playableInstance) {
        Iterator it = z92.z1(getListeners()).iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).notifyStop(playableInstance);
        }
    }

    public static /* synthetic */ void pause$default(RiveFileController riveFileController, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        riveFileController.pause((List<String>) list, z);
    }

    public static /* synthetic */ void play$default(RiveFileController riveFileController, List list, Loop loop, Direction direction, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            loop = Loop.AUTO;
        }
        Loop loop2 = loop;
        if ((i & 4) != 0) {
            direction = Direction.AUTO;
        }
        Direction direction2 = direction;
        if ((i & 8) != 0) {
            z = false;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = true;
        }
        riveFileController.play((List<String>) list, loop2, direction2, z3, z2);
    }

    public static /* synthetic */ void play$kotlin_release$default(RiveFileController riveFileController, StateMachineInstance stateMachineInstance, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        riveFileController.play$kotlin_release(stateMachineInstance, z);
    }

    private final void playAnimation(String animationName, Loop loop, Direction direction, boolean isStateMachine, boolean settleInitialState) {
        Artboard artboard;
        if (isStateMachine) {
            Iterator<T> it = getOrCreateStateMachines(animationName).iterator();
            while (it.hasNext()) {
                play$kotlin_release((StateMachineInstance) it.next(), settleInitialState);
            }
            return;
        }
        List<LinearAnimationInstance> listAnimations = animations(animationName);
        Iterator<T> it2 = listAnimations.iterator();
        while (it2.hasNext()) {
            play$kotlin_release((LinearAnimationInstance) it2.next(), loop, direction);
        }
        if (!listAnimations.isEmpty() || (artboard = this.activeArtboard) == null) {
            return;
        }
        play$kotlin_release(artboard.animation(animationName), loop, direction);
    }

    public static /* synthetic */ void playAnimation$default(RiveFileController riveFileController, String str, Loop loop, Direction direction, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            loop = Loop.AUTO;
        }
        Loop loop2 = loop;
        if ((i & 4) != 0) {
            direction = Direction.AUTO;
        }
        Direction direction2 = direction;
        if ((i & 8) != 0) {
            z = false;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = true;
        }
        riveFileController.playAnimation(str, loop2, direction2, z3, z2);
    }

    private final void processAllInputs() {
        ChangedInput changedInputPoll;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (!this.changedInputs.isEmpty() && (changedInputPoll = this.changedInputs.poll()) != null) {
            if (changedInputPoll.getNestedArtboardPath() == null) {
                for (StateMachineInstance stateMachineInstance : getOrCreateStateMachines(changedInputPoll.getStateMachineName())) {
                    linkedHashSet.add(stateMachineInstance);
                    SMIInput sMIInputInput = stateMachineInstance.input(changedInputPoll.getName());
                    if (sMIInputInput instanceof SMITrigger) {
                        ((SMITrigger) sMIInputInput).fire$kotlin_release();
                    } else if (sMIInputInput instanceof SMIBoolean) {
                        Object value = changedInputPoll.getValue();
                        value.getClass();
                        ((SMIBoolean) sMIInputInput).setValue$kotlin_release(((Boolean) value).booleanValue());
                    } else if (sMIInputInput instanceof SMINumber) {
                        Object value2 = changedInputPoll.getValue();
                        value2.getClass();
                        ((SMINumber) sMIInputInput).setValue$kotlin_release(((Float) value2).floatValue());
                    }
                }
            } else {
                Artboard artboard = this.activeArtboard;
                SMIInput sMIInputInput2 = artboard != null ? artboard.input(changedInputPoll.getName(), changedInputPoll.getNestedArtboardPath()) : null;
                if (sMIInputInput2 instanceof SMITrigger) {
                    ((SMITrigger) sMIInputInput2).fire$kotlin_release();
                } else if (sMIInputInput2 instanceof SMIBoolean) {
                    Object value3 = changedInputPoll.getValue();
                    value3.getClass();
                    ((SMIBoolean) sMIInputInput2).setValue$kotlin_release(((Boolean) value3).booleanValue());
                } else if (sMIInputInput2 instanceof SMINumber) {
                    Object value4 = changedInputPoll.getValue();
                    value4.getClass();
                    ((SMINumber) sMIInputInput2).setValue$kotlin_release(((Float) value4).floatValue());
                }
            }
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            play$kotlin_release((StateMachineInstance) it.next(), false);
        }
    }

    private final void queueInput(String stateMachineName, String inputName, Object value, String path) {
        queueInputs$kotlin_release(new ChangedInput(stateMachineName, inputName, value, path));
    }

    public static /* synthetic */ void queueInput$default(RiveFileController riveFileController, String str, String str2, Object obj, String str3, int i, Object obj2) {
        if ((i & 4) != 0) {
            obj = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        riveFileController.queueInput(str, str2, obj, str3);
    }

    private final boolean resolveStateMachineAdvance(StateMachineInstance stateMachineInstance, float elapsed) {
        if (!getEventListeners().isEmpty()) {
            Iterator<T> it = stateMachineInstance.getEventsReported().iterator();
            while (it.hasNext()) {
                notifyEvent((RiveEvent) it.next());
            }
        }
        boolean zAdvance = stateMachineInstance.advance(elapsed);
        if (!getListeners().isEmpty()) {
            Iterator<T> it2 = stateMachineInstance.getStatesChanged().iterator();
            while (it2.hasNext()) {
                notifyStateChanged(stateMachineInstance, (LayerState) it2.next());
            }
        }
        return zAdvance;
    }

    public static /* synthetic */ void selectArtboard$default(RiveFileController riveFileController, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        riveFileController.selectArtboard(str);
    }

    private final void setArtboard(Artboard ab) {
        if (wl7.b(ab, this.activeArtboard)) {
            return;
        }
        stopAnimations();
        setActiveArtboard(ab);
        autoplay();
    }

    public static /* synthetic */ void setBooleanState$default(RiveFileController riveFileController, String str, String str2, boolean z, String str3, int i, Object obj) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        riveFileController.setBooleanState(str, str2, z, str3);
    }

    public static /* synthetic */ void setNumberState$default(RiveFileController riveFileController, String str, String str2, float f, String str3, int i, Object obj) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        riveFileController.setNumberState(str, str2, f, str3);
    }

    public static /* synthetic */ void setRiveFile$default(RiveFileController riveFileController, File file, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        riveFileController.setRiveFile(file, str);
    }

    private final List<StateMachineInstance> stateMachines(Collection<String> animationNames) {
        List<StateMachineInstance> stateMachines = getStateMachines();
        ArrayList arrayList = new ArrayList();
        for (Object obj : stateMachines) {
            if (animationNames.contains(((StateMachineInstance) obj).getName())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final void stop(LinearAnimationInstance animation) {
        this.playingAnimationSet.remove(animation);
        if (this.animationList.remove(animation)) {
            notifyStop(animation);
        }
    }

    public static /* synthetic */ void stopAnimations$default(RiveFileController riveFileController, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        riveFileController.stopAnimations((List<String>) list, z);
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public int acquire() {
        return RefCount.DefaultImpls.acquire(this);
    }

    public final void addEventListener(RiveEventListener listener) {
        listener.getClass();
        synchronized (this.startStopLock) {
            this._eventListeners.add(listener);
        }
    }

    public final void advance(float elapsed) {
        ReentrantLock lock;
        File file = this.file;
        if (file == null || (lock = file.getLock()) == null) {
            return;
        }
        synchronized (lock) {
            try {
                Artboard artboard = this.activeArtboard;
                if (artboard != null) {
                    processAllInputs();
                    boolean zIsEmpty = false;
                    for (LinearAnimationInstance linearAnimationInstance : getAnimations()) {
                        if (getPlayingAnimations().contains(linearAnimationInstance)) {
                            AdvanceResult advanceResultAdvanceAndGetResult = linearAnimationInstance.advanceAndGetResult(elapsed);
                            linearAnimationInstance.apply();
                            int i = WhenMappings.$EnumSwitchMapping$0[advanceResultAdvanceAndGetResult.ordinal()];
                            if (i == 1) {
                                stop(linearAnimationInstance);
                            } else if (i == 2 || i == 3) {
                                notifyLoop(linearAnimationInstance);
                            } else if (i == 4) {
                                zIsEmpty = getPlayingStateMachines().isEmpty();
                            }
                        }
                    }
                    if (zIsEmpty) {
                        artboard.advance(elapsed);
                    }
                    ArrayList arrayList = new ArrayList();
                    for (StateMachineInstance stateMachineInstance : getStateMachines()) {
                        if (getPlayingStateMachines().contains(stateMachineInstance) && !resolveStateMachineAdvance(stateMachineInstance, elapsed)) {
                            arrayList.add(stateMachineInstance);
                        }
                    }
                    if (elapsed > 0.0d) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            pause((StateMachineInstance) it.next());
                        }
                    }
                    HashSet<StateMachineInstance> playingStateMachines = getPlayingStateMachines();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<T> it2 = playingStateMachines.iterator();
                    while (it2.hasNext()) {
                        ViewModelInstance viewModelInstance = ((StateMachineInstance) it2.next()).getViewModelInstance();
                        if (viewModelInstance != null) {
                            arrayList2.add(viewModelInstance);
                        }
                    }
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        ((ViewModelInstance) it3.next()).pollChanges$kotlin_release();
                    }
                    notifyAdvance(elapsed);
                    j6g j6gVar = j6g.a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void autoplay() {
        if (this.autoplay) {
            play$default(this, null, null, true, 3, null);
            return;
        }
        Artboard artboard = this.activeArtboard;
        if (artboard != null) {
            artboard.advance(0.0f);
        }
        synchronized (this.startStopLock) {
            gu5<j6g> gu5Var = this.onStart;
            if (gu5Var != null) {
                gu5Var.invoke();
                j6g j6gVar = j6g.a;
            }
        }
    }

    public final void fireState(String stateMachineName, String inputName, String path) {
        stateMachineName.getClass();
        inputName.getClass();
        queueInput$default(this, stateMachineName, inputName, null, path, 4, null);
    }

    public final void fireStateAtPath(String inputName, String path) {
        inputName.getClass();
        path.getClass();
        queueInput$default(this, "", inputName, null, path, 4, null);
    }

    public final Artboard getActiveArtboard() {
        return this.activeArtboard;
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final List<LinearAnimationInstance> getAnimations() {
        List<LinearAnimationInstance> listZ1;
        List<LinearAnimationInstance> list = this.animationList;
        list.getClass();
        synchronized (list) {
            List<LinearAnimationInstance> list2 = this.animationList;
            list2.getClass();
            listZ1 = z92.z1(list2);
        }
        return listZ1;
    }

    public final RectF getArtboardBounds() {
        RectF bounds;
        Artboard artboard = this.activeArtboard;
        return (artboard == null || (bounds = artboard.getBounds()) == null) ? new RectF() : bounds;
    }

    public final boolean getAutoplay() {
        return this.autoplay;
    }

    public final ConcurrentLinkedQueue<ChangedInput> getChangedInputs$kotlin_release() {
        return this.changedInputs;
    }

    public final HashSet<RiveEventListener> getEventListeners() {
        HashSet<RiveEventListener> hashSetX1;
        synchronized (this._eventListeners) {
            hashSetX1 = z92.x1(this._eventListeners);
        }
        return hashSetX1;
    }

    public final File getFile() {
        return this.file;
    }

    public final Fit getFit() {
        return this.fit;
    }

    public final Float getLayoutScaleFactor() {
        return this.layoutScaleFactor;
    }

    public final float getLayoutScaleFactorActive$kotlin_release() {
        Float f = this.layoutScaleFactor;
        return f != null ? f.floatValue() : this.layoutScaleFactorAutomatic;
    }

    public final float getLayoutScaleFactorAutomatic() {
        return this.layoutScaleFactorAutomatic;
    }

    public final HashSet<Listener> getListeners() {
        HashSet<Listener> hashSetX1;
        synchronized (this._listeners) {
            hashSetX1 = z92.x1(this._listeners);
        }
        return hashSetX1;
    }

    public final Loop getLoop() {
        return this.loop;
    }

    public final gu5<j6g> getOnStart() {
        return this.onStart;
    }

    public final Set<LinearAnimationInstance> getPausedAnimations() {
        List<LinearAnimationInstance> animations = getAnimations();
        HashSet<LinearAnimationInstance> playingAnimations = getPlayingAnimations();
        animations.getClass();
        playingAnimations.getClass();
        Set<LinearAnimationInstance> setD1 = z92.D1(animations);
        setD1.removeAll(w92.z0(playingAnimations));
        return setD1;
    }

    public final Set<StateMachineInstance> getPausedStateMachines() {
        List<StateMachineInstance> stateMachines = getStateMachines();
        HashSet<StateMachineInstance> playingStateMachines = getPlayingStateMachines();
        stateMachines.getClass();
        playingStateMachines.getClass();
        Set<StateMachineInstance> setD1 = z92.D1(stateMachines);
        setD1.removeAll(w92.z0(playingStateMachines));
        return setD1;
    }

    public final HashSet<LinearAnimationInstance> getPlayingAnimations() {
        HashSet<LinearAnimationInstance> hashSetX1;
        Set<LinearAnimationInstance> set = this.playingAnimationSet;
        set.getClass();
        synchronized (set) {
            Set<LinearAnimationInstance> set2 = this.playingAnimationSet;
            set2.getClass();
            hashSetX1 = z92.x1(set2);
        }
        return hashSetX1;
    }

    public final HashSet<StateMachineInstance> getPlayingStateMachines() {
        HashSet<StateMachineInstance> hashSetX1;
        Set<StateMachineInstance> set = this.playingStateMachineSet;
        set.getClass();
        synchronized (set) {
            Set<StateMachineInstance> set2 = this.playingStateMachineSet;
            set2.getClass();
            hashSetX1 = z92.x1(set2);
        }
        return hashSetX1;
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public int getRefCount() {
        return RefCount.DefaultImpls.getRefCount(this);
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public AtomicInteger getRefs() {
        return this.refs;
    }

    /* JADX INFO: renamed from: getRequireArtboardResize$kotlin_release, reason: from getter */
    public final AtomicBoolean getRequireArtboardResize() {
        return this.requireArtboardResize;
    }

    /* JADX INFO: renamed from: getStartStopLock$kotlin_release, reason: from getter */
    public final ReentrantLock getStartStopLock() {
        return this.startStopLock;
    }

    public final List<StateMachineInstance> getStateMachines() {
        List<StateMachineInstance> listZ1;
        List<StateMachineInstance> list = this.stateMachineList;
        list.getClass();
        synchronized (list) {
            List<StateMachineInstance> list2 = this.stateMachineList;
            list2.getClass();
            listZ1 = z92.z1(list2);
        }
        return listZ1;
    }

    public final RectF getTargetBounds() {
        return this.targetBounds;
    }

    public final String getTextRunValue(String textRunName, String path) {
        textRunName.getClass();
        path.getClass();
        Artboard artboard = this.activeArtboard;
        if (artboard != null) {
            return artboard.getTextRunValue(textRunName, path);
        }
        return null;
    }

    public final Float getVolume() {
        Artboard artboard = this.activeArtboard;
        if (artboard != null) {
            return Float.valueOf(artboard.getVolume());
        }
        return null;
    }

    /* JADX INFO: renamed from: isActive, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    public final boolean isAdvancing() {
        Set<LinearAnimationInstance> set = this.playingAnimationSet;
        set.getClass();
        if (!set.isEmpty()) {
            return true;
        }
        Set<StateMachineInstance> set2 = this.playingStateMachineSet;
        set2.getClass();
        return (set2.isEmpty() && this.changedInputs.isEmpty()) ? false : true;
    }

    public final void pause(List<String> animationNames, boolean areStateMachines) {
        animationNames.getClass();
        if (areStateMachines) {
            Iterator<T> it = stateMachines(animationNames).iterator();
            while (it.hasNext()) {
                pause((StateMachineInstance) it.next());
            }
        } else {
            Iterator<T> it2 = animations(animationNames).iterator();
            while (it2.hasNext()) {
                pause((LinearAnimationInstance) it2.next());
            }
        }
    }

    public final void play(Loop loop, Direction direction, boolean settleInitialState) {
        loop.getClass();
        direction.getClass();
        Artboard artboard = this.activeArtboard;
        if (artboard != null) {
            if (!getPausedAnimations().isEmpty() || !getPausedStateMachines().isEmpty()) {
                Iterator<T> it = getAnimations().iterator();
                while (it.hasNext()) {
                    play$kotlin_release((LinearAnimationInstance) it.next(), loop, direction);
                }
                Iterator<T> it2 = getStateMachines().iterator();
                while (it2.hasNext()) {
                    play$kotlin_release((StateMachineInstance) it2.next(), settleInitialState);
                }
                return;
            }
            List<String> animationNames = artboard.getAnimationNames();
            if (!animationNames.isEmpty()) {
                playAnimation$default(this, (String) z92.O0(animationNames), loop, direction, false, false, 24, null);
            }
            List<String> stateMachineNames = artboard.getStateMachineNames();
            if (stateMachineNames.isEmpty()) {
                return;
            }
            playAnimation((String) z92.O0(stateMachineNames), loop, direction, true, settleInitialState);
        }
    }

    public final void play$kotlin_release(LinearAnimationInstance animationInstance, Loop loop, Direction direction) {
        animationInstance.getClass();
        loop.getClass();
        direction.getClass();
        Loop loop2 = Loop.AUTO;
        if (loop == loop2) {
            loop = this.loop;
        }
        if (loop != loop2) {
            animationInstance.setLoop(loop);
        }
        if (!this.animationList.contains(animationInstance)) {
            if (direction == Direction.BACKWARDS) {
                animationInstance.time(animationInstance.getEndTime());
            }
            this.animationList.add(animationInstance);
        }
        if (direction != Direction.AUTO) {
            animationInstance.setDirection(direction);
        }
        synchronized (this.startStopLock) {
            this.playingAnimationSet.add(animationInstance);
            gu5<j6g> gu5Var = this.onStart;
            if (gu5Var != null) {
                gu5Var.invoke();
                j6g j6gVar = j6g.a;
            }
        }
        notifyPlay(animationInstance);
    }

    public final void pointerEvent(PointerEvents eventType, float x, float y) {
        RectF rectF;
        eventType.getClass();
        Helpers helpers = Helpers.INSTANCE;
        RectF rectF2 = this.targetBounds;
        PointF pointF = new PointF(x, y);
        Fit fit = this.fit;
        Alignment alignment = this.alignment;
        Artboard artboard = this.activeArtboard;
        if (artboard == null || (rectF = artboard.getBounds()) == null) {
            rectF = new RectF();
        }
        PointF pointFConvertToArtboardSpace = helpers.convertToArtboardSpace(rectF2, pointF, fit, alignment, rectF, getLayoutScaleFactorActive$kotlin_release());
        for (StateMachineInstance stateMachineInstance : getStateMachines()) {
            int i = WhenMappings.$EnumSwitchMapping$1[eventType.ordinal()];
            if (i == 1) {
                stateMachineInstance.pointerDown(pointFConvertToArtboardSpace.x, pointFConvertToArtboardSpace.y);
            } else if (i == 2) {
                stateMachineInstance.pointerUp(pointFConvertToArtboardSpace.x, pointFConvertToArtboardSpace.y);
            } else if (i == 3) {
                stateMachineInstance.pointerMove(pointFConvertToArtboardSpace.x, pointFConvertToArtboardSpace.y);
            }
            play$kotlin_release(stateMachineInstance, false);
        }
    }

    public final void queueInputs$kotlin_release(ChangedInput... inputs) {
        inputs.getClass();
        synchronized (this.startStopLock) {
            w92.x0(this.changedInputs, inputs);
            gu5<j6g> gu5Var = this.onStart;
            if (gu5Var != null) {
                gu5Var.invoke();
                j6g j6gVar = j6g.a;
            }
        }
    }

    @Override // app.rive.runtime.kotlin.Observable
    public void registerListener(Listener listener) {
        listener.getClass();
        synchronized (this.startStopLock) {
            this._listeners.add(listener);
        }
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public int release() {
        int iRelease = RefCount.DefaultImpls.release(this);
        if (iRelease < 0) {
            l5.q("Failed requirement.");
            return 0;
        }
        if (iRelease != 0) {
            return iRelease;
        }
        if (this.isActive) {
            l5.q("Failed requirement.");
            return 0;
        }
        setFile(null);
        return iRelease;
    }

    public final void removeEventListener(RiveEventListener listener) {
        listener.getClass();
        synchronized (this.startStopLock) {
            this._eventListeners.remove(listener);
        }
    }

    public final void reset$kotlin_release() {
        this.playingAnimationSet.clear();
        this.animationList.clear();
        this.playingStateMachineSet.clear();
        this.stateMachineList.clear();
        this.changedInputs.clear();
        setActiveArtboard(null);
    }

    @ControllerStateManagement
    public final void restoreControllerState(ControllerState state) {
        Object lock;
        state.getClass();
        File file = this.file;
        if (file == null || (lock = file.getLock()) == null) {
            lock = this;
        }
        synchronized (lock) {
            try {
                reset$kotlin_release();
                setFile(state.getFile());
                setActiveArtboard(state.getActiveArtboard());
                Iterator<T> it = state.getAnimations().iterator();
                while (it.hasNext()) {
                    this.animationList.add((LinearAnimationInstance) it.next());
                }
                Iterator<T> it2 = state.getStateMachines().iterator();
                while (it2.hasNext()) {
                    this.stateMachineList.add((StateMachineInstance) it2.next());
                }
                for (LinearAnimationInstance linearAnimationInstance : state.getPlayingAnimations()) {
                    play$kotlin_release(linearAnimationInstance, linearAnimationInstance.getLoop(), linearAnimationInstance.getDirection());
                }
                Iterator<T> it3 = state.getPlayingStateMachines().iterator();
                while (it3.hasNext()) {
                    play$kotlin_release$default(this, (StateMachineInstance) it3.next(), false, 2, null);
                }
                this.isActive = state.getIsActive();
                state.dispose();
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @ControllerStateManagement
    public final ControllerState saveControllerState() {
        Artboard artboard;
        File file = this.file;
        if (file == null || (artboard = this.activeArtboard) == null) {
            return null;
        }
        synchronized (file.getLock()) {
            if (!file.getHasCppObject()) {
                return null;
            }
            file.acquire();
            artboard.acquire();
            List<LinearAnimationInstance> list = this.animationList;
            list.getClass();
            List listZ1 = z92.z1(list);
            HashSet hashSetX1 = z92.x1(getPlayingAnimations());
            List<StateMachineInstance> list2 = this.stateMachineList;
            list2.getClass();
            return new ControllerState(file, artboard, listZ1, hashSetX1, z92.z1(list2), z92.x1(getPlayingStateMachines()), this.isActive);
        }
    }

    public final void selectArtboard(String name) {
        File file = this.file;
        if (file != null) {
            setArtboard(name != null ? file.artboard(name) : file.getFirstArtboard());
        } else {
            Log.w(TAG, "selectArtboard: cannot select an Artboard without a valid File.");
        }
    }

    public final void setActive(boolean z) {
        this.isActive = z;
    }

    public final void setActiveArtboard(Artboard artboard) {
        Object lock;
        if (wl7.b(artboard, this.activeArtboard)) {
            return;
        }
        File file = this.file;
        if (file == null || (lock = file.getLock()) == null) {
            lock = this;
        }
        synchronized (lock) {
            try {
                Artboard artboard2 = this.activeArtboard;
                if (artboard2 != null) {
                    artboard2.release();
                }
                this.activeArtboard = artboard;
                if (artboard != null) {
                    artboard.acquire();
                }
                Float f = this.userSetVolume;
                if (f != null) {
                    float fFloatValue = f.floatValue();
                    Artboard artboard3 = this.activeArtboard;
                    if (artboard3 != null) {
                        artboard3.setVolume$kotlin_release(fFloatValue);
                    }
                    j6g j6gVar = j6g.a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void setAlignment(Alignment alignment) {
        alignment.getClass();
        this.alignment = alignment;
        synchronized (this.startStopLock) {
            gu5<j6g> gu5Var = this.onStart;
            if (gu5Var != null) {
                gu5Var.invoke();
                j6g j6gVar = j6g.a;
            }
        }
    }

    public final void setAutoplay(boolean z) {
        this.autoplay = z;
    }

    public final void setBooleanState(String stateMachineName, String inputName, boolean value, String path) {
        stateMachineName.getClass();
        inputName.getClass();
        queueInput(stateMachineName, inputName, Boolean.valueOf(value), path);
    }

    public final void setBooleanStateAtPath(String inputName, boolean value, String path) {
        inputName.getClass();
        path.getClass();
        queueInput("", inputName, Boolean.valueOf(value), path);
    }

    public final void setFile(File file) {
        Object lock;
        if (wl7.b(file, this.file)) {
            return;
        }
        File file2 = this.file;
        if (file2 == null || (lock = file2.getLock()) == null) {
            lock = this;
        }
        synchronized (lock) {
            try {
                File file3 = this.file;
                if (file3 != null) {
                    reset$kotlin_release();
                    file3.release();
                }
                this.file = file;
                if (file != null) {
                    file.acquire();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void setFit(Fit fit) {
        fit.getClass();
        this.fit = fit;
        this.requireArtboardResize.set(true);
        synchronized (this.startStopLock) {
            gu5<j6g> gu5Var = this.onStart;
            if (gu5Var != null) {
                gu5Var.invoke();
                j6g j6gVar = j6g.a;
            }
        }
    }

    public final void setLayoutScaleFactor(Float f) {
        this.layoutScaleFactor = f;
        this.requireArtboardResize.set(true);
        synchronized (this.startStopLock) {
            gu5<j6g> gu5Var = this.onStart;
            if (gu5Var != null) {
                gu5Var.invoke();
                j6g j6gVar = j6g.a;
            }
        }
    }

    public final void setLayoutScaleFactorAutomatic$kotlin_release(float f) {
        this.layoutScaleFactorAutomatic = f;
        this.requireArtboardResize.set(true);
        synchronized (this.startStopLock) {
            gu5<j6g> gu5Var = this.onStart;
            if (gu5Var != null) {
                gu5Var.invoke();
                j6g j6gVar = j6g.a;
            }
        }
    }

    public final void setLoop(Loop loop) {
        loop.getClass();
        this.loop = loop;
    }

    public final void setNumberState(String stateMachineName, String inputName, float value, String path) {
        stateMachineName.getClass();
        inputName.getClass();
        queueInput(stateMachineName, inputName, Float.valueOf(value), path);
    }

    public final void setNumberStateAtPath(String inputName, float value, String path) {
        inputName.getClass();
        path.getClass();
        queueInput("", inputName, Float.valueOf(value), path);
    }

    public final void setOnStart(gu5<j6g> gu5Var) {
        this.onStart = gu5Var;
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public void setRefs(AtomicInteger atomicInteger) {
        atomicInteger.getClass();
        this.refs = atomicInteger;
    }

    public final void setRequireArtboardResize$kotlin_release(AtomicBoolean atomicBoolean) {
        atomicBoolean.getClass();
        this.requireArtboardResize = atomicBoolean;
    }

    public final void setRiveFile(File file, String artboardName) {
        file.getClass();
        if (file.equals(this.file)) {
            return;
        }
        setFile(file);
        selectArtboard(artboardName);
    }

    public final void setTargetBounds(RectF rectF) {
        rectF.getClass();
        this.targetBounds = rectF;
    }

    public final void setTextRunValue(String textRunName, String textValue) throws TextValueRunException {
        textRunName.getClass();
        textValue.getClass();
        Artboard artboard = this.activeArtboard;
        if (artboard != null) {
            artboard.setTextRunValue(textRunName, textValue);
        }
        Iterator<T> it = getStateMachines().iterator();
        while (it.hasNext()) {
            play$kotlin_release((StateMachineInstance) it.next(), false);
        }
    }

    public final void setVolume(float value) {
        this.userSetVolume = Float.valueOf(value);
        Artboard artboard = this.activeArtboard;
        if (artboard == null) {
            return;
        }
        artboard.setVolume$kotlin_release(value);
    }

    public final void setupScene$kotlin_release(RiveAnimationView.RendererAttributes rendererAttributes) throws ViewModelException, StateMachineException {
        Artboard artboard;
        rendererAttributes.getClass();
        File file = this.file;
        if (file == null) {
            Log.w(TAG, "Cannot init without a file");
            return;
        }
        reset$kotlin_release();
        this.autoplay = rendererAttributes.getAutoplay();
        setAlignment(rendererAttributes.getAlignment());
        setFit(rendererAttributes.getFit());
        this.loop = rendererAttributes.getLoop();
        String artboardName = rendererAttributes.getArtboardName();
        setActiveArtboard(artboardName != null ? file.artboard(artboardName) : file.getFirstArtboard());
        if (rendererAttributes.getAutoBind() && (artboard = this.activeArtboard) != null) {
            artboard.getClass();
            ViewModelInstance viewModelInstanceCreateDefaultInstance = file.defaultViewModelForArtboard(artboard).createDefaultInstance();
            artboard.setViewModelInstance(viewModelInstanceCreateDefaultInstance);
            String stateMachineName = rendererAttributes.getStateMachineName();
            if (stateMachineName == null) {
                stateMachineName = (String) z92.Q0(artboard.getStateMachineNames());
            }
            if (stateMachineName != null) {
                getOrCreateStateMachines(stateMachineName);
            }
            Iterator<T> it = getStateMachines().iterator();
            while (it.hasNext()) {
                ((StateMachineInstance) it.next()).setViewModelInstance(viewModelInstanceCreateDefaultInstance);
            }
        }
        if (!this.autoplay) {
            Artboard artboard2 = this.activeArtboard;
            if (artboard2 != null) {
                artboard2.advance(0.0f);
            }
            synchronized (this.startStopLock) {
                gu5<j6g> gu5Var = this.onStart;
                if (gu5Var != null) {
                    gu5Var.invoke();
                    j6g j6gVar = j6g.a;
                }
            }
            return;
        }
        String animationName = rendererAttributes.getAnimationName();
        String stateMachineName2 = rendererAttributes.getStateMachineName();
        if (animationName != null) {
            play$default(this, animationName, (Loop) null, (Direction) null, false, false, 30, (Object) null);
        } else if (stateMachineName2 != null) {
            play$default(this, stateMachineName2, (Loop) null, (Direction) null, true, true, 6, (Object) null);
        } else {
            play$default(this, null, null, true, 3, null);
        }
    }

    public final void stopAnimations() {
        List<LinearAnimationInstance> list = this.animationList;
        list.getClass();
        if (!list.isEmpty()) {
            Iterator<T> it = getAnimations().iterator();
            while (it.hasNext()) {
                stop((LinearAnimationInstance) it.next());
            }
        }
        List<StateMachineInstance> list2 = this.stateMachineList;
        list2.getClass();
        if (list2.isEmpty()) {
            return;
        }
        Iterator<T> it2 = getStateMachines().iterator();
        while (it2.hasNext()) {
            stop((StateMachineInstance) it2.next());
        }
    }

    @Override // app.rive.runtime.kotlin.Observable
    public void unregisterListener(Listener listener) {
        listener.getClass();
        synchronized (this.startStopLock) {
            this._listeners.remove(listener);
        }
    }

    public static /* synthetic */ void pause$default(RiveFileController riveFileController, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        riveFileController.pause(str, z);
    }

    public static /* synthetic */ void stopAnimations$default(RiveFileController riveFileController, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        riveFileController.stopAnimations(str, z);
    }

    private final void stop(StateMachineInstance stateMachine) {
        this.playingStateMachineSet.remove(stateMachine);
        if (this.stateMachineList.remove(stateMachine)) {
            notifyStop(stateMachine);
        }
    }

    public final String getTextRunValue(String textRunName) {
        textRunName.getClass();
        Artboard artboard = this.activeArtboard;
        if (artboard != null) {
            return artboard.getTextRunValue(textRunName);
        }
        return null;
    }

    public static /* synthetic */ void play$default(RiveFileController riveFileController, String str, Loop loop, Direction direction, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            loop = Loop.AUTO;
        }
        Loop loop2 = loop;
        if ((i & 4) != 0) {
            direction = Direction.AUTO;
        }
        Direction direction2 = direction;
        if ((i & 8) != 0) {
            z = false;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = true;
        }
        riveFileController.play(str, loop2, direction2, z3, z2);
    }

    public static /* synthetic */ void play$default(RiveFileController riveFileController, Loop loop, Direction direction, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            loop = Loop.AUTO;
        }
        if ((i & 2) != 0) {
            direction = Direction.AUTO;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        riveFileController.play(loop, direction, z);
    }

    public final void setTextRunValue(String textRunName, String textValue, String path) throws TextValueRunException {
        q6.m(textRunName, textValue, path);
        Artboard artboard = this.activeArtboard;
        if (artboard != null) {
            artboard.setTextRunValue(textRunName, textValue, path);
        }
        Iterator<T> it = getStateMachines().iterator();
        while (it.hasNext()) {
            play$kotlin_release((StateMachineInstance) it.next(), false);
        }
    }

    private final List<LinearAnimationInstance> animations(String animationName) {
        return animations(u63.Z(animationName));
    }

    private final List<StateMachineInstance> stateMachines(String animationName) {
        return stateMachines(u63.Z(animationName));
    }

    public final void pause() {
        Iterator<T> it = getPlayingAnimations().iterator();
        while (it.hasNext()) {
            pause((LinearAnimationInstance) it.next());
        }
        Iterator<T> it2 = getPlayingStateMachines().iterator();
        while (it2.hasNext()) {
            pause((StateMachineInstance) it2.next());
        }
    }

    public final void pause(String animationName, boolean isStateMachine) {
        animationName.getClass();
        if (isStateMachine) {
            Iterator<T> it = stateMachines(animationName).iterator();
            while (it.hasNext()) {
                pause((StateMachineInstance) it.next());
            }
        } else {
            Iterator<T> it2 = animations(animationName).iterator();
            while (it2.hasNext()) {
                pause((LinearAnimationInstance) it2.next());
            }
        }
    }

    private final void pause(LinearAnimationInstance animation) {
        if (this.playingAnimationSet.remove(animation)) {
            notifyPause(animation);
        }
    }

    private final void pause(StateMachineInstance stateMachine) {
        if (this.playingStateMachineSet.remove(stateMachine)) {
            notifyPause(stateMachine);
        }
    }

    public final void play$kotlin_release(StateMachineInstance stateMachineInstance, boolean settleStateMachineState) {
        stateMachineInstance.getClass();
        if (!this.stateMachineList.contains(stateMachineInstance)) {
            this.stateMachineList.add(stateMachineInstance);
        }
        if (settleStateMachineState) {
            resolveStateMachineAdvance(stateMachineInstance, 0.0f);
        }
        synchronized (this.startStopLock) {
            this.playingStateMachineSet.add(stateMachineInstance);
            gu5<j6g> gu5Var = this.onStart;
            if (gu5Var != null) {
                gu5Var.invoke();
                j6g j6gVar = j6g.a;
            }
        }
        notifyPlay(stateMachineInstance);
    }

    public final void stopAnimations(List<String> animationNames, boolean areStateMachines) {
        animationNames.getClass();
        if (areStateMachines) {
            Iterator<T> it = stateMachines(animationNames).iterator();
            while (it.hasNext()) {
                stop((StateMachineInstance) it.next());
            }
        } else {
            Iterator<T> it2 = animations(animationNames).iterator();
            while (it2.hasNext()) {
                stop((LinearAnimationInstance) it2.next());
            }
        }
    }

    public final void stopAnimations(String animationName, boolean isStateMachine) {
        animationName.getClass();
        if (isStateMachine) {
            Iterator<T> it = stateMachines(animationName).iterator();
            while (it.hasNext()) {
                stop((StateMachineInstance) it.next());
            }
        } else {
            Iterator<T> it2 = animations(animationName).iterator();
            while (it2.hasNext()) {
                stop((LinearAnimationInstance) it2.next());
            }
        }
    }

    public RiveFileController() {
        this(null, false, null, null, null, null, 63, null);
    }

    public /* synthetic */ RiveFileController(Loop loop, boolean z, File file, Artboard artboard, gu5 gu5Var, ConcurrentLinkedQueue concurrentLinkedQueue, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Loop.AUTO : loop, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : file, (i & 8) != 0 ? null : artboard, (i & 16) != 0 ? null : gu5Var, (i & 32) != 0 ? new ConcurrentLinkedQueue() : concurrentLinkedQueue);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ RiveFileController(app.rive.runtime.kotlin.core.Loop r2, boolean r3, app.rive.runtime.kotlin.core.File r4, app.rive.runtime.kotlin.core.Artboard r5, defpackage.gu5 r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L6
            app.rive.runtime.kotlin.core.Loop r2 = app.rive.runtime.kotlin.core.Loop.AUTO
        L6:
            r8 = r7 & 2
            if (r8 == 0) goto Lb
            r3 = 1
        Lb:
            r8 = r7 & 4
            r0 = 0
            if (r8 == 0) goto L11
            r4 = r0
        L11:
            r8 = r7 & 8
            if (r8 == 0) goto L16
            r5 = r0
        L16:
            r7 = r7 & 16
            if (r7 == 0) goto L21
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L27
        L21:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L27:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: app.rive.runtime.kotlin.controllers.RiveFileController.<init>(app.rive.runtime.kotlin.core.Loop, boolean, app.rive.runtime.kotlin.core.File, app.rive.runtime.kotlin.core.Artboard, gu5, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RiveFileController(Loop loop, boolean z, File file, Artboard artboard, gu5<j6g> gu5Var) {
        this(loop, z, file, artboard, gu5Var, new ConcurrentLinkedQueue());
        loop.getClass();
    }

    public final void play(String animationName, Loop loop, Direction direction, boolean isStateMachine, boolean settleInitialState) {
        animationName.getClass();
        loop.getClass();
        direction.getClass();
        playAnimation(animationName, loop, direction, isStateMachine, settleInitialState);
    }

    public final void play(List<String> animationNames, Loop loop, Direction direction, boolean areStateMachines, boolean settleInitialState) {
        animationNames.getClass();
        loop.getClass();
        direction.getClass();
        Iterator<T> it = animationNames.iterator();
        while (it.hasNext()) {
            playAnimation((String) it.next(), loop, direction, areStateMachines, settleInitialState);
        }
    }
}
