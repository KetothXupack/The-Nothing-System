/*
 * Copyright (c) 2012, Nikita Lipsky, Excelsior LLC.
 *
 *  The Nothing System is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  The Nothing System is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
 *
*/
package com.excelsior.nothing.controls;

import javax.swing.*;
import java.awt.*;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * Panel control.
 *
 * @author kit
 */
public class Panel extends JPanel implements Externalizable {
    private static final long serialVersionUID = 1030230214076481436l;

    public static final int SERIAL_VERSION = 1;

    public Panel() {
        super(null);
    }

    public void writeExternal(ObjectOutput out) throws IOException {
        out.write(SERIAL_VERSION);
        Externalization.writeExternal(this, out);
        out.writeInt(getComponentCount());
        for (Component c: getComponents()) {
            out.writeObject(c);
        }
    }

    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        int v = in.read();
        if (v != SERIAL_VERSION) {
            throw new IOException("Unexpected TextField version: " + v);
        }
        Externalization.readExternal(this, in);
        int cou = in.readInt();
        for (int i = 0; i < cou; i++) {
            add((Component) in.readObject());
        }
    }
}