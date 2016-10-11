/*
 * This file is part of the Weba.IO package.
 *
 * Copyright (c) 2016 Damian Zientalak, Marcin Nitschke, Michał Sikora
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 */

package io.weba.eventor.core.exception;

public class DropEventException extends EventorException {
    public DropEventException(String message) {
        super(message);
    }

    public DropEventException(String message, Throwable cause) {
        super(message, cause);
    }
}
