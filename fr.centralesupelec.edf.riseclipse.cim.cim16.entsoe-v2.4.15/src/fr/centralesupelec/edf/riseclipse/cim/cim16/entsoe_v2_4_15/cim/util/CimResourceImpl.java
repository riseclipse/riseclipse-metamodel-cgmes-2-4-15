/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLLoad;

import fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.CimObjectWithID;
import fr.centralesupelec.edf.riseclipse.cim.cim16.util.AbstractCim16Resource;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.util.CimResourceFactoryImpl
 * @generated NOT
 */
public class CimResourceImpl extends AbstractCim16Resource {

    /**
     * Creates an instance of the resource.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param uri the URI of the new resource.
     * @generated NOT
     */
    public CimResourceImpl( URI uri ) {
        super( uri );

        // We cannot register the CimPackage with entsoe_URI because resourceSet is null when the resource is created !
    }

    @Override
    protected XMLLoad createXMLLoad() {
        return new CimXmlLoadImpl( createXMLHelper() );
    }

    // TODO: why do we need to override it ?
    @Override
    public String getID( EObject eObject ) {
        if( eObject instanceof CimObjectWithID ) {
            return ( ( CimObjectWithID ) eObject ).getID();
        }
        return super.getID( eObject );
    }

    // TODO: why do we need to override it ?
    @Override
    public void setID( EObject eObject, String id ) {
        if( eObject instanceof CimObjectWithID ) {
            ( ( CimObjectWithID ) eObject ).setID( id );
        }
        super.setID( eObject, id );
    }

}
