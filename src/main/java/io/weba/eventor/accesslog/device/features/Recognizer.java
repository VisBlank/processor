/*
 * This file is part of the Weba.IO package.
 *
 * Copyright (c) 2016 Damian Zientalak, Marcin Nitschke, Michał Sikora
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 */

package io.weba.eventor.accesslog.device.features;

import io.weba.eventor.accesslog.AccessLog;
import io.weba.eventor.core.exception.DropEventException;

import java.util.Map;

public interface Recognizer {
    void recognize(AccessLog accessLog, Map<String, Object> features) throws DropEventException;
}
