/*
 * This file is part of the Weba.IO package.
 *
 * Copyright (c) 2016 Damian Zientalak, Marcin Nitschke, Michał Sikora
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 */

package io.weba.eventor.accesslog.matcher;

import io.weba.eventor.accesslog.AccessLog;
import io.weba.eventor.core.event.Id;
import io.weba.eventor.core.exception.EventorException;

public class RequestIdMatcherImpl implements Matcher {
    @Override
    public void match(AccessLog accessLog) throws EventorException {
        accessLog.builder.id = new Id((String) accessLog.readAtPath("request.id"));
    }
}
