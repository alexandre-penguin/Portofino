/*
 * Copyright (C) 2005-2009 ManyDesigns srl.  All rights reserved.
 * http://www.manydesigns.com/
 *
 * Unless you have purchased a commercial license agreement from ManyDesigns srl,
 * the following license terms apply:
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 3 as published by
 * the Free Software Foundation.
 *
 * There are special exceptions to the terms and conditions of the GPL 
 * as it is applied to this software. View the full text of the 
 * exception in file OPEN-SOURCE-LICENSE.txt in the directory of this
 * software distribution.
 *
 * This program is distributed WITHOUT ANY WARRANTY; and without the
 * implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, see http://www.gnu.org/licenses/gpl.txt
 * or write to:
 * Free Software Foundation, Inc.,
 * 59 Temple Place - Suite 330,
 * Boston, MA  02111-1307  USA
 *
 */
package com.manydesigns.portofino.base.model;

import com.manydesigns.portofino.base.database.HibernateConfig;
import junit.framework.TestCase;
import org.hibernate.Session;

import java.util.List;
import java.util.Map;

/**
 * @author Giampiero Granatella - giampiero.granatella@manydesigns.com
 * @author Angelo    Lupo       - angelo.lupo@manydesigns.com
 * @author Paolo     Predonzani - paolo.predonzani@manydesigns.com
 */
public class HibernateTest extends TestCase {
    DataModel dataModel;
    DBParser parser;

    public void setUp() {
        parser = new DBParser();
    }


    public void tearDown() {

    }

    public void testPersona() {
        try {
            dataModel = parser.parse(
                    "databases/jpetstore/postgresql/jpetstore-postgres.xml");


            Session session = HibernateConfig.getSessionFactory(dataModel)
                    .get("jpetstore").getCurrentSession();
            session.beginTransaction();
            List<Map> resultCat =
                    (List<Map>) session.createQuery("from category ").list();

            int sizeCat = resultCat.size();
            assertEquals("categorie", sizeCat, 5);


            Map categoria0 = resultCat.get(0);
            assertEquals("Fish", categoria0.get("name") );
            Map categoria1 = resultCat.get(1);
            assertEquals( "Dogs", categoria1.get("name"));
            Map categoria2 = resultCat.get(2);
            assertEquals("Reptiles", categoria2.get("name") );
            Map categoria3 = resultCat.get(3);
            assertEquals("Cats", categoria3.get("name") );
            Map categoria4 = resultCat.get(4);
            assertEquals("Birds",categoria4.get("name"));

            List<Map> resultProd =
                    (List<Map>) session.createQuery("from product ").list();

            int sizePrd = resultProd.size();
            assertEquals("prodotti", sizePrd, 16);


            Map prd0 = resultProd.get(0);
            //assertEquals("AV-CB-01", prd0.get("productId") );
            assertEquals("FISH", prd0.get("category") );
            assertEquals("Angelfish", prd0.get("name") );



            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

}




